package com.returncontinue.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
	
	//who is sending request, user or admin
	private String role;
	
	//prompt
	private String content;

	public Message(String role, String content) {
		super();
		this.role = role;
		this.content = content;
	}
	

}
