# 💳 Payment API

API de pagamentos desenvolvida em Java + Spring Boot, com foco em arquitetura limpa, logging estruturado e boas práticas de backend.

---

## 🚀 Objetivo

Simular um sistema real de pagamentos aplicando:

* Arquitetura em camadas
* Logs estruturados (5W1H)
* Tratamento global de erros
* Boas práticas de versionamento

---

## 🏗️ Arquitetura
```
src/main/java/dev/leandromoraes/paymentapi
├── adapters
│   └── in
│       └── web
├── application
├── domain
├── infrastructure
│   └── logger
└── presentation
└── handler
```
---

## ⚙️ Tecnologias

* Java 17+
* Spring Boot
* Maven
* PostgreSQL (Docker)
* Redis (Docker)

---

## 🐳 Infra local

```bash
docker-compose up -d
```

---

## 📡 Endpoints

### Health Check

```http
GET /health
```

Response:

```json
{
  "status": "UP"
}
```

---

## 📊 Logging (5W1H)

O projeto utiliza logs estruturados no padrão:

* where → onde aconteceu
* why → por que aconteceu
* when → quando aconteceu
* who → quem causou
* what → o que aconteceu
* how → como aconteceu

Exemplo:

```json
{
  "where": "HealthController",
  "what": "health_check",
  "why": "system_monitoring",
  "who": "system",
  "how": "GET /health",
  "when": "2026-05-04T16:00:00"
}
```

---

## ⚠️ Tratamento de Erros

Implementado com `@RestControllerAdvice`, garantindo:

* respostas padronizadas
* logging estruturado
* desacoplamento da lógica de negócio

---

## 🧪 Status

Em desenvolvimento

---

## 👨‍💻 Autor

Leandro Moraes
