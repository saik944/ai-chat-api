package com.sai.aichatapi.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService
{
    public String getResponse(String message) {
        return "You said: " + message;
    }
}
