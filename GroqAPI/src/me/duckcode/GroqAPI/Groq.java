package me.duckcode.GroqAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import com.google.gson.Gson;

import me.duckcode.GroqAPI.parameters.Model;
import me.duckcode.GroqAPI.request.GroqRequest;
import me.duckcode.GroqAPI.request.RequestMessage;
import me.duckcode.GroqAPI.response.GroqResponse;

public class Groq {

	private final String apiEndPoint = "https://api.groq.com/openai/v1/chat/completions";
	private final String apiKey;
	private Model model;

	public Groq(String apiKey, Model model) {
		this.apiKey = apiKey;
		this.model = model;
	}

	public GroqResponse createChatCompletion(RequestMessage... messages) {

		try {

			Gson gson = new Gson();
			GroqRequest request = new GroqRequest(Arrays.asList(messages), model);
			String data = gson.toJson(request);

			
			URL url = new URL(apiEndPoint);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Authorization", "Bearer " + apiKey);
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setDoOutput(true);

			
			try (OutputStream os = connection.getOutputStream()) {
				os.write(data.getBytes(StandardCharsets.UTF_8));
			}
			

			StringBuilder response = new StringBuilder();
			try (BufferedReader in = new BufferedReader(
					new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
				String line;
				while ((line = in.readLine()) != null) {
					response.append(line);
				}
			}

			
			return gson.fromJson(response.toString(), GroqResponse.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String createChatCompletionText(RequestMessage... messages) {
		GroqResponse response = createChatCompletion(messages);

		if (response != null)
			return response.getChoices().get(0).getMessage().getContent();

		return "";
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public String getApiKey() {
		return apiKey;
	}

}