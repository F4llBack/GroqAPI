package me.duckcode.GroqAPI.request;

import java.util.List;

import me.duckcode.GroqAPI.parameters.Model;

public class GroqRequest {

	public List<RequestMessage> messages;
	public String model;

	public GroqRequest(List<RequestMessage> messages, Model model) {
		this.messages = messages;
		this.model = model.getModelCode();
	}

	public List<RequestMessage> getMessages() {
		return messages;
	}

	public void setMessages(List<RequestMessage> messages) {
		this.messages = messages;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
