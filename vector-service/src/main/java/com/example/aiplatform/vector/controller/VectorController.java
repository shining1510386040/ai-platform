package com.example.aiplatform.vector.controller;

import com.example.aiplatform.vector.domain.VectorTask;
import com.example.aiplatform.vector.service.VectorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vector")
public class VectorController {

    private final VectorService service;

    public VectorController(VectorService service) {
        this.service = service;
    }

    @GetMapping("/sample")
    public VectorTask sample() {
        return service.getSample();
    }
}
