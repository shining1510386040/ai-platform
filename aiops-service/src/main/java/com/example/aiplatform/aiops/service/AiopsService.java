package com.example.aiplatform.aiops.service;

import com.example.aiplatform.aiops.domain.AiopsTask;
import org.springframework.stereotype.Service;

@Service
public class AiopsService {

    public AiopsTask getSample() {
        return new AiopsTask("aiops-001", "aiops capability", "READY");
    }
}
