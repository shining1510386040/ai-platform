package com.example.aiplatform.gateway.service;

import com.example.aiplatform.gateway.domain.GatewayTask;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GatewayService {

    public Mono<GatewayTask> getOverview() {
        return Mono.just(new GatewayTask("gateway-001", "Gateway Routing", "RUNNING"));
    }
}
