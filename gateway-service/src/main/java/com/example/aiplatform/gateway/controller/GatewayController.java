package com.example.aiplatform.gateway.controller;

import com.example.aiplatform.gateway.domain.GatewayTask;
import com.example.aiplatform.gateway.service.GatewayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/gateway")
public class GatewayController {

    private final GatewayService service;

    public GatewayController(GatewayService service) {
        this.service = service;
    }

    @GetMapping("/overview")
    public Mono<GatewayTask> overview() {
        return service.getOverview();
    }
}
