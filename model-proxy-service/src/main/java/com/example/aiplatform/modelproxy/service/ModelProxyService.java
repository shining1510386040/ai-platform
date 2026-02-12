package com.example.aiplatform.modelproxy.service;

import com.example.aiplatform.modelproxy.domain.ModelProxyTask;
import org.springframework.stereotype.Service;

@Service
public class ModelProxyService {

    public ModelProxyTask getSample() {
        return new ModelProxyTask("model-proxy-001", "model-proxy capability", "READY");
    }
}
