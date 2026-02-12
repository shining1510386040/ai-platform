package com.example.aiplatform.governance.service;

import com.example.aiplatform.governance.domain.GovernanceTask;
import org.springframework.stereotype.Service;

@Service
public class GovernanceService {

    public GovernanceTask getSample() {
        return new GovernanceTask("governance-001", "governance capability", "READY");
    }
}
