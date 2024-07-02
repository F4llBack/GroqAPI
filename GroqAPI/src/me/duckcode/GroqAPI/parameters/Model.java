package me.duckcode.GroqAPI.parameters;

public enum Model {
	Llama3_8b("llama3-8b-8192", 8192, Developer.Meta), Llama3_70b("llama3-70b-8192", 8192, Developer.Meta),
	Mixtral("mixtral-8x7b-32768", 32768, Developer.Mistral), Gemma("gemma-7b-it", 8192, Developer.Google),
	DEFAULT("llama3-8b-8192", 8192, Developer.Meta);

	public String modelCode;
	public int maxTokens;
	public Developer developer;

	Model(String modelCode, int maxTokens, Developer developer) {
		this.modelCode = modelCode;
		this.developer = developer;
		this.maxTokens = maxTokens;
	}

	public String getModelCode() {
		return modelCode;
	}

	public int getMaxTokens() {
		return maxTokens;
	}

	public Developer getDeveloper() {
		return developer;
	}
}