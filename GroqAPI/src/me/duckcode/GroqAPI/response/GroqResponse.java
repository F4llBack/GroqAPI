package me.duckcode.GroqAPI.response;

import java.util.List;

public class GroqResponse {

	public String id;
	public String object;
	public int created;
	public String model;
	public List<Choice> choices;
	public Usage usage;
	public String system_fingerprint;
	public XGroq x_groq;

	public String getId() {
		return id;
	}

	public String getObject() {
		return object;
	}

	public int getCreated() {
		return created;
	}

	public String getModel() {
		return model;
	}

	public List<Choice> getChoices() {
		return choices;
	}

	public Usage getUsage() {
		return usage;
	}

	public String getSystemFingerprint() {
		return system_fingerprint;
	}

	public XGroq getXGroq() {
		return x_groq;
	}
}
