package me.duckcode.GroqAPI.response;

public class Usage {
	public int prompt_tokens;
	public double prompt_time;
	public int completion_tokens;
	public double completion_time;
	public int total_tokens;
	public double total_time;

	public int getPrompt_tokens() {
		return prompt_tokens;
	}

	public double getPrompt_time() {
		return prompt_time;
	}

	public int getCompletion_tokens() {
		return completion_tokens;
	}

	public double getCompletion_time() {
		return completion_time;
	}

	public int getTotal_tokens() {
		return total_tokens;
	}

	public double getTotal_time() {
		return total_time;
	}

}
