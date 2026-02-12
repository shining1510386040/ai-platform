package com.example.aiplatform.agent.service;

import com.example.aiplatform.agent.domain.AgentTask;
import org.springframework.stereotype.Service;

@Service
public class AgentService {

    public AgentTask getSample() {
        return new AgentTask("agent-001", "agent capability", "READY");
    }
}
