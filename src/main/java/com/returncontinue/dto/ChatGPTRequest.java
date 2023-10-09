package com.returncontinue.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ChatGPTRequest {
	
	//model of chatgpt
	private String model;
	
	//prompt as message
	private List<Message> messages;

	public ChatGPTRequest(String model, String prompt) {
		this.model = model;
		this.messages = new ArrayList<>();
		//passing prompt
		this.messages.add(new Message("user", prompt));
	}
}
