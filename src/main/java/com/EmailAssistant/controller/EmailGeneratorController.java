package com.EmailAssistant.controller;

import com.EmailAssistant.DTO.EmailRequest;
import com.EmailAssistant.service.EmailGeneratorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")

public class EmailGeneratorController {

    private final EmailGeneratorService emailGeneratorService;
    public EmailGeneratorController(EmailGeneratorService emailGeneratorService) {
        this.emailGeneratorService = emailGeneratorService;
    }


    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
        String response = emailGeneratorService.GenerateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }
}

