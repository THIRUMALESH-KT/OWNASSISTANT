package com.assistant.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/voice-to-text")
public class Controller {


    @PostMapping
    public String convertVoiceToText(@RequestBody String audioData) {
        // Process audioData here (e.g., using a speech-to-text library).
    	System.out.println(audioData);
        return "Text: " + audioData;
    }
}

