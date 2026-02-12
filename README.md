# Enterprise Spring Boot AI Platform Template

本仓库提供一个企业级 Spring Boot AI 平台的 Maven 多模块模板，覆盖如下核心微服务：

- Gateway
- Prompt
- RAG
- Agent
- Model Proxy
- Vector
- MLOps
- AIOps
- Governance

## 目录结构

```text
ai-platform/
├── pom.xml
├── platform-common/
├── gateway-service/
├── prompt-service/
├── rag-service/
├── agent-service/
├── model-proxy-service/
├── vector-service/
├── mlops-service/
├── aiops-service/
└── governance-service/
```

## 模块说明

- `platform-common`：公共模型与基础能力。
- `gateway-service`：统一 API 网关与路由入口。
- 其他服务：每个模块均包含 `controller`、`service`、`domain` 三层示例骨架。

## 快速开始

```bash
mvn clean verify
```

按需进入任一模块启动：

```bash
cd prompt-service
mvn spring-boot:run
```
