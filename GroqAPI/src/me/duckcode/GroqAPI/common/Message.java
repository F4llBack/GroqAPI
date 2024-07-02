package me.duckcode.GroqAPI.common;

import me.duckcode.GroqAPI.parameters.Role;

public class Message {
	
	public String role;
	public String content;

	public Message(Role role, String content) {
		this.role = role.getRoleSpecification();
		this.content = content;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
