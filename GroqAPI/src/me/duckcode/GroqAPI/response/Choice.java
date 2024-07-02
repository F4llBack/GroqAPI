package me.duckcode.GroqAPI.response;

public class Choice {
	public int index;
	public ResponseMessage message;
	public Object logprobs;
	public String finish_reason;

	public int getIndex() {
		return index;
	}

	public ResponseMessage getMessage() {
		return message;
	}

	public Object getLogprobs() {
		return logprobs;
	}

	public String getFinish_reason() {
		return finish_reason;
	}

}
