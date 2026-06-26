# 🚕 Catxi Backend

가톨릭대학교 학생들을 위한 실시간 택시 합승 플랫폼의 백엔드 서비스입니다.

<img width="2000" height="1200" alt="image" src="https://github.com/user-attachments/assets/4ec1163c-5ad4-4660-851e-f84b1b70102d" />
<img width="2000" height="1200" alt="image" src="https://github.com/user-attachments/assets/2055e1fa-be82-463f-a7c1-35c24852aace" />


## 📋 개요

Catxi Backend는 가톨릭대학교 캠퍼스 근처에서 학생들의 안전하고 경제적인 택시 합승을 지원하는 RESTful API 서버입니다. 실시간 채팅, 위치 공유, 매칭 시스템을 제공하여 학생들이 편리하게 택시를 공유할 수 있도록 돕습니다.

## 🛠 기술 스택

### 코어 프레임워크
- **Spring Boot 3.3.1** - Java 17 기반 웹 애플리케이션 프레임워크
- **Spring Security + JWT** - 인증 및 권한 관리
- **Spring Data JPA** - 데이터베이스 ORM
- **QueryDSL** - 타입 안전 동적 쿼리 생성

### 데이터베이스 & 캐시
- **MySQL** - 관계형 데이터베이스
- **Redis** - 세션 관리 및 실시간 메시징
- **Spring Data Redis** - Redis 연동

### 실시간 통신
- **WebSocket (STOMP)** - 실시간 채팅 기능
- **Redis Pub/Sub** - 다중 서버 간 메시지 브로드캐스팅

### 외부 서비스 연동
- **OAuth2 Client** - 소셜 로그인
- **Firebase Cloud Messaging (FCM)** - 푸시 알림
- **Spring Boot Actuator** - 애플리케이션 모니터링

### 개발 & 운영 도구
- **Swagger (SpringDoc OpenAPI)** - API 문서화
- **Liquibase** - 데이터베이스 마이그레이션
- **Prometheus + Grafana + Loki** - 로그 및 메트릭 수집 및 시각화
- **Docker & Docker Compose** - 컨테이너화
- **Ansible(AWX Operator)** - 인프라 자동화
- **Jenkins** - 빌드 도구

## 🏗 아키텍처
<img width="1851" height="1121" alt="Catxi 운영 아키텍처" src="docs/assets/ops-architecture.svg" />


## 📚 API 문서

애플리케이션 실행 후 다음 URL에서 API 문서를 확인할 수 있습니다:

- **Swagger UI**: http://localhost:8080/swagger-ui.html

### 모니터링
- **애플리케이션 상태**: http://localhost:8080/actuator/health
- **메트릭**: http://localhost:8080/actuator/prometheus

## 👥 개발팀

| 역할 | 이름 | GitHub |
|------|------|--------|
| PM/Backend | 이동준 | [@dongjune8931](https://github.com/dongjune8931) |
| Backend | 이가영 | [@LGY010011](https://github.com/LGY010011) |
| Backend | 최민수 | [@Neo1228](https://github.com/Neo1228) |
| Backend | 박규민 | [@FrontHeadlock](https://github.com/FrontHeadlock) |
