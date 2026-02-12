package com.example.aiplatform.prompt.controller;

import com.example.aiplatform.prompt.domain.PromptTask;
import com.example.aiplatform.prompt.service.PromptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prompt")
public class PromptController {

    private final PromptService service;

    public PromptController(PromptService service) {
        this.service = service;
    }

    @GetMapping("/sample")
    public PromptTask sample() {
        return service.getSample();
    }
}
