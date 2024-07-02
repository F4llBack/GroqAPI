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
	
	public static Role fromSpecification(String specification) {
		for (Role role : Role.values()) {
            if (role.getRoleSpecification().equalsIgnoreCase(specification)) {
                return role;
            }
        }
		throw new IllegalArgumentException();
	}
}
