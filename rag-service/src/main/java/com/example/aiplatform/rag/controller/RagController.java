package com.example.aiplatform.rag.controller;

import com.example.aiplatform.rag.domain.RagTask;
import com.example.aiplatform.rag.service.RagService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rag")
public class RagController {

    private final RagService service;

    public RagController(RagService service) {
        this.service = service;
    }

    @GetMapping("/sample")
    public RagTask sample() {
        return service.getSample();
    }
}
