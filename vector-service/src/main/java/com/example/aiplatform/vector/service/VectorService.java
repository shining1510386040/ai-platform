package com.example.aiplatform.vector.service;

import com.example.aiplatform.vector.domain.VectorTask;
import org.springframework.stereotype.Service;

@Service
public class VectorService {

    public VectorTask getSample() {
        return new VectorTask("vector-001", "vector capability", "READY");
    }
}
