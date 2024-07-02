package me.duckcode.GroqAPI.response;

public class Usage {
	public int prompt_tokens;
	public double prompt_time;
	public int completion_tokens;
	public double completion_time;
	public int total_tokens;
	public double total_time;

	public int getPromptTokens() {
		return prompt_tokens;
	}

	public double getPromptTime() {
		return prompt_time;
	}

	public int getCompletionTokens() {
		return completion_tokens;
	}

	public double getCompletionTime() {
		return completion_time;
	}

	public int getTotalTokens() {
		return total_tokens;
	}

	public double getTotalTime() {
		return total_time;
	}

}
