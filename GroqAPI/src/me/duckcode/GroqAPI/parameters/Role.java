package me.duckcode.GroqAPI.parameters;

public enum Role {
	
	System("system"),
	User("user"), 
	Assistant("assistant");
	
	public String roleSpecification;

	Role(String roleSpecification) {
		this.roleSpecification = roleSpecification;
	}

	public String getRoleSpecification() {
		return roleSpecification;
	}
}
