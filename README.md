# 📦 User CRUD App - Spring Boot + MySQL + Docker

Aplicación CRUD de usuarios con backend en Spring Boot, base de datos MySQL, y gestión visual mediante PhpMyAdmin. Todo desplegado con Docker.

---

## 🚀 Puertos Usados

| Servicio     | Puerto Host | Puerto Contenedor |
|--------------|-------------|-------------------|
| App Backend  | `8080`      | `8080`            |
| PhpMyAdmin   | `8081`      | `80`              |
| MySQL        | `3307`      | `3306`            |

---

## 🛠️ Endpoints API REST

Base URL: `http://localhost:8080/api/users`

| Método | Endpoint            | Descripción                  | Body JSON Requerido              |
|--------|---------------------|------------------------------|----------------------------------|
| GET    | `/api/users`        | Obtener todos los usuarios   | —                                |
| POST   | `/api/users`        | Crear un nuevo usuario       | `{ "name": "Juan", "email": "a@b.com" }` |
| PUT    | `/api/users/{id}`   | Actualizar un usuario        | `{ "name": "Pedro", "email": "nuevo@correo.com" }` |
| DELETE | `/api/users/{id}`   | Eliminar un usuario          | —                                |

---

## 🔐 Credenciales de
