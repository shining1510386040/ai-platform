package com.example.aiplatform.mlops.controller;

import com.example.aiplatform.mlops.domain.MlopsTask;
import com.example.aiplatform.mlops.service.MlopsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mlops")
public class MlopsController {

    private final MlopsService service;

    public MlopsController(MlopsService service) {
        this.service = service;
    }

    @GetMapping("/sample")
    public MlopsTask sample() {
        return service.getSample();
    }
}
