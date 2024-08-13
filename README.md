# Distinct Subsequences
Este programa tiene como finalidad evaluar al candidato en sus habilidades de programación y resolución de problemas, en programación
## Precondiciones
* El programa esta escrito en Java 17 con el uso del framework Spring Boot 3.
* El programa debe ser compilado con Gradle (asegurese de tener instalado gradle).
* Ejecute los siguiente comandos:
```shell
./gradlew build
```
* Tenga en cuenta que la aplicacion se ejecuta en el puerto 8080 de su computador por lo cual recomiendo que este libre este puerto, previo a ejecutar la aplicación.
* El anterior comando compila la aplicacion
* Para ejecutar la aplicacion ejecute el siguiente comando:
```shell
./gradlew bootRun
```
## Probar la funcionalidad
* Puede hacer uso de swagger para probar la funcionalidad de la aplicación, para ello abra un navegador y escriba la siguiente URL:
```shell
http://localhost:8080/swagger-ui/index.html
```
* O si prefiere puede hacer uso de postman, para ello importe el archivo appgate.postman_collection.json en postman y pruebe la funcionalidad.
# Diagrama de Clases
El patron de arquitectura de código utilizado es el de arquitectura limpia el cual una capa de dominio de la aplicacion, una capa de casos de uso, una capa de Infraestructura (Adaptadores) y una capa de aplicación, las cuales se aplicaron a nivel de paquetes dentro de la solución presentado:
![class diagram](https://github.com/user-attachments/assets/7ca321e7-49fb-40d2-af94-4d958a2ea1ad)

## Domain
![domain](https://github.com/user-attachments/assets/dd38a321-46e7-43ee-a821-364a0c8be39e)

## Use Case
![usecase](https://github.com/user-attachments/assets/3fb7d4b6-01eb-4824-b821-4f861bca3309)

## Adapters
![adapter](https://github.com/user-attachments/assets/46f0129f-6dbd-4dd4-a4d9-9c81112ad38e)

## Application
![app](https://github.com/user-attachments/assets/6dd1b0da-c9a9-49b1-8e00-72ab8b93a046)
