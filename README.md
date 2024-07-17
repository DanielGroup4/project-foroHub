
# Book API

Este proyecto es una API REST para la gestión de libros, implementada en Java usando Spring Boot. La API sigue las mejores prácticas del modelo REST y utiliza una base de datos relacional para la persistencia de la información. Además, cuenta con un sistema de autenticación y autorización para restringir el acceso a la información.

## Tecnologías Utilizadas

- Java 17
- Spring Boot 3.2.3
- Maven
- Lombok
- Spring Web
- Spring Boot DevTools
- Spring Data JPA
- Flyway Migration
- MySQL Driver
- Validation
- Spring Security

## Configuración del Entorno

### Prerrequisitos

- Java 17 o superior
- Maven 4 o superior
- MySQL

### Configuración de la Base de Datos

1. Crea una base de datos en MySQL:

   ```sql
   CREATE DATABASE bookdb;
   ```

2. Configura las credenciales de la base de datos en `src/main/resources/application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/bookdb?useSSL=false&serverTimezone=UTC
   spring.datasource.username=root
   spring.datasource.password=rootpassword
   spring.jpa.hibernate.ddl-auto=none
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

   # Flyway configuration
   spring.flyway.enabled=true
   spring.flyway.baseline-on-migrate=true
   ```

### Instalación

1. Clona el repositorio:

   ```bash
   git clone https://github.com/tu_usuario/book-api.git
   cd book-api
   ```

2. Construye el proyecto usando Maven:

   ```bash
   mvn clean install
   ```

3. Ejecuta la aplicación:

   ```bash
   mvn spring-boot:run
   ```

### Endpoints de la API

- `GET /api/books`: Obtiene todos los libros.
- `GET /api/books/{id}`: Obtiene un libro por su ID.
- `POST /api/books`: Crea un nuevo libro (requiere autenticación).
- `PUT /api/books/{id}`: Actualiza un libro existente (requiere autenticación).
- `DELETE /api/books/{id}`: Elimina un libro (requiere autenticación).

### Ejemplo de Solicitud y Respuesta

#### Crear un Libro

- **Request**:

  ```json
  POST /api/books
  Content-Type: application/json

  {
    "title": "Clean Code",
    "author": "Robert C. Martin",
    "language": "English",
    "downloadUrl": "https://example.com/clean-code.pdf"
  }
  ```

- **Response**:

  ```json
  {
    "id": 1,
    "title": "Clean Code",
    "author": "Robert C. Martin",
    "language": "English",
    "downloadUrl": "https://example.com/clean-code.pdf",
    "createdAt": "2023-07-16T10:00:00"
  }
  ```

### Seguridad

La API utiliza Spring Security para la autenticación y autorización. Los endpoints para crear, actualizar y eliminar libros requieren autenticación y están restringidos a usuarios con el rol `ADMIN`.

### Migraciones de Base de Datos

El proyecto utiliza Flyway para manejar las migraciones de base de datos. Las migraciones se encuentran en el directorio `src/main/resources/db/migration`.

### Contribuciones

Las contribuciones son bienvenidas. Para contribuir, sigue estos pasos:

1. Haz un fork del proyecto.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza los cambios necesarios y haz commit (`git commit -am 'Añadir nueva funcionalidad'`).
4. Empuja los cambios a la rama (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

### Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo `LICENSE` para obtener más información.
```

### Notas Adicionales

- Asegúrate de que los campos `spring.datasource.username` y `spring.datasource.password` en `application.properties` coincidan con tu configuración local de MySQL.
- Puedes añadir más detalles sobre la configuración de seguridad y ejemplos de uso en la sección correspondiente del README.
- Adapta el contenido según las especificaciones y necesidades de tu proyecto.
