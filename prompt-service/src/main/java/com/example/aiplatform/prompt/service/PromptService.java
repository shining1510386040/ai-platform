package com.example.aiplatform.prompt.service;

import com.example.aiplatform.prompt.domain.PromptTask;
import org.springframework.stereotype.Service;

@Service
public class PromptService {

    public PromptTask getSample() {
        return new PromptTask("prompt-001", "prompt capability", "READY");
    }
}
