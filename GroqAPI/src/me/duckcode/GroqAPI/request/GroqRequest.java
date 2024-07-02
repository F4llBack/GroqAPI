package me.duckcode.GroqAPI.request;

import java.util.List;

import me.duckcode.GroqAPI.common.Message;
import me.duckcode.GroqAPI.parameters.Model;

public class GroqRequest {

	public List<Message> messages;
	public String model;

	public GroqRequest(List<Message> messages, Model model) {
		this.messages = messages;
		this.model = model.getModelCode();
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
