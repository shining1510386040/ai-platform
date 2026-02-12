package com.example.aiplatform.rag.service;

import com.example.aiplatform.rag.domain.RagTask;
import org.springframework.stereotype.Service;

@Service
public class RagService {

    public RagTask getSample() {
        return new RagTask("rag-001", "rag capability", "READY");
    }
}
