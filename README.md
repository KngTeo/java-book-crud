Book CRUD App - Spring Boot + MySQL + Docker
Aplicación CRUD de libros con backend en Spring Boot, base de datos MySQL y gestión visual mediante PhpMyAdmin. Todo desplegado con Docker.

---

Puertos Usados

Servicio	Puerto Host	Puerto Contenedor
App Backend	8080	8080
PhpMyAdmin	8081	80
MySQL	3307	3306

---

Endpoints API REST
Base URL: http://localhost:8080/api/books


Método	Endpoint	Descripción	Body JSON Requerido
GET	/api/books	Obtener todos los libros	—
POST	/api/books	Crear un nuevo libro	{ "name": "Libro Ejemplo", "author": "Autor Ejemplo" }
PUT	/api/books/{id}	Actualizar un libro	{ "name": "Nuevo Libro", "author": "Nuevo Autor" }
DELETE	/api/books/{id}	Eliminar un libro	—

LINK VIDEO DE EXPLICACION: https://www.youtube.com/watch?v=LKgF1OuGerg
