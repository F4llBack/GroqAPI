package me.duckcode.GroqAPI.response;

import me.duckcode.GroqAPI.common.Message;

public class Choice {
	public int index;
	public Message message;
	public Object logprobs;
	public String finish_reason;

	public int getIndex() {
		return index;
	}

	public Message getMessage() {
		return message;
	}

	public Object getLogprobs() {
		return logprobs;
	}

	public String getFinishReason() {
		return finish_reason;
	}

}
