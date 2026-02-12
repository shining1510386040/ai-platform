package com.example.aiplatform.agent.controller;

import com.example.aiplatform.agent.domain.AgentTask;
import com.example.aiplatform.agent.service.AgentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/agent")
public class AgentController {

    private final AgentService service;

    public AgentController(AgentService service) {
        this.service = service;
    }

    @GetMapping("/sample")
    public AgentTask sample() {
        return service.getSample();
    }
}
