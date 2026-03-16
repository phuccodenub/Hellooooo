# Personal Intro Project (Direction B: FE + BE + DB)

This project is structured into 3 services and runs with Docker Compose:

- `frontend`: static web app served by Nginx (pulled from Docker Hub)
- `backend`: Java 21 Spring Boot API + Thymeleaf page (pulled from Docker Hub)
- `db`: PostgreSQL 15 with seed data

## Project Structure

```text
backend/   Spring Boot (JDK 21)
frontend/  Static HTML + Nginx reverse proxy to backend
db/        PostgreSQL init script
docker-compose.yml
```

## Run with Docker Compose

docker compose up -d

Access:

- Frontend: http://localhost:3000
- Backend API: http://localhost:8080/api/profile
- Backend Thymeleaf page: http://localhost:8080/
- PostgreSQL: localhost:5433

Default DB credentials:

- DB: `intro`
- User: `intro_user`
- Password: `intro_pass`

## Local Backend Test

From `backend/`:

```bash
./mvnw test
```

Tests use H2 in-memory DB via `src/test/resources/application.properties`.

## Docker Hub Push

```bash
docker build -t <dockerhub_user>/nguyensyphuc-backend:1.0 ./backend
docker build -t <dockerhub_user>/nguyensyphuc-frontend:1.0 ./frontend

docker push <dockerhub_user>/nguyensyphuc-backend:1.0
docker push <dockerhub_user>/nguyensyphuc-frontend:1.0
```

Optional: replace `build:` with `image:` in `docker-compose.yml` when deploying from prebuilt images.

Current compose already uses prebuilt images:

- phucdeptrai29/nguyensyphuc-backend:1.1
- phucdeptrai29/nguyensyphuc-frontend:1.1
