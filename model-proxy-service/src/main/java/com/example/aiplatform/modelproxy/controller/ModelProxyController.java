package com.example.aiplatform.modelproxy.controller;

import com.example.aiplatform.modelproxy.domain.ModelProxyTask;
import com.example.aiplatform.modelproxy.service.ModelProxyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/model-proxy")
public class ModelProxyController {

    private final ModelProxyService service;

    public ModelProxyController(ModelProxyService service) {
        this.service = service;
    }

    @GetMapping("/sample")
    public ModelProxyTask sample() {
        return service.getSample();
    }
}
