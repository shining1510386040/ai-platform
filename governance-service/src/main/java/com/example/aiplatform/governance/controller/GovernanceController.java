package com.example.aiplatform.governance.controller;

import com.example.aiplatform.governance.domain.GovernanceTask;
import com.example.aiplatform.governance.service.GovernanceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/governance")
public class GovernanceController {

    private final GovernanceService service;

    public GovernanceController(GovernanceService service) {
        this.service = service;
    }

    @GetMapping("/sample")
    public GovernanceTask sample() {
        return service.getSample();
    }
}
