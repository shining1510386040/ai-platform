package com.example.aiplatform.aiops.controller;

import com.example.aiplatform.aiops.domain.AiopsTask;
import com.example.aiplatform.aiops.service.AiopsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/aiops")
public class AiopsController {

    private final AiopsService service;

    public AiopsController(AiopsService service) {
        this.service = service;
    }

    @GetMapping("/sample")
    public AiopsTask sample() {
        return service.getSample();
    }
}
