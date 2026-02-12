package com.example.aiplatform.mlops.service;

import com.example.aiplatform.mlops.domain.MlopsTask;
import org.springframework.stereotype.Service;

@Service
public class MlopsService {

    public MlopsTask getSample() {
        return new MlopsTask("mlops-001", "mlops capability", "READY");
    }
}
