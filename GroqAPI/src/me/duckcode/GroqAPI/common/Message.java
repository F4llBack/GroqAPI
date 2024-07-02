package me.duckcode.GroqAPI.common;

import me.duckcode.GroqAPI.parameters.Role;

public class Message {
	
	public String role;
	public String content;

	public Message(Role role, String content) {
		this.role = role.getRoleSpecification();
		this.content = content;
	}

	public Role getRole() {		
		return Role.fromSpecification(role);
	}

	public void setRole(Role role) {
		this.role = role.getRoleSpecification();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
