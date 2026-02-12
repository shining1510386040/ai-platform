package com.example.aiplatform.common.domain;

import java.time.Instant;

public record BaseRequestContext(String tenantId, String traceId, Instant requestTime) {
}
