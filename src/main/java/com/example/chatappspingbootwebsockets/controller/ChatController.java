package com.example.chatappspingbootwebsockets.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "${frontendURL}")
public class ChatController {

    @GetMapping("")
    public String welcome() {
        return "Welcome!";
    }

    @MessageMapping("/send")
    @SendTo("/receive")
    public String sendMessage(String msg) {
        return "The received message was: " + msg;
    }
}
