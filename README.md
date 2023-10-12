# Security-Project-With-Spring-And-Angular
A secure Spring application integrated with Angular.

Skills: Java, Spring Boot, Angular, Spring Security, REST API, TypeScript, JavaScript, HTML, Maven, JSON, IntelliJ IDEA, Git

The application we have here is close to what a user might expect in a "real" application in a live environment, and it probably could be used as a Microservice or as a template for building a more complicated application. 
Spring Security, Spring Boot and Angular are working together to provide a pleasant and secure user experience in a "single page application" where we offer some navigation features (home, login, logout).

Spring Boot and Angular are both integrated and running at port 8080(http://localhost:8080/).
We use Spring Security for log in.

To have the full version of the project, you need to add or check the front end from Front_End_For_Security-Project-With-Spring-And-Angular repo and copy it in Security-Project-With-Spring-And-Angular/Spring/src/main/resources/Angular path of this project.

How to run:
- step 1: clone this project and the fron end(in Security-Project-With-Spring-And-Angular/Spring/src/main/resources/Angular path)
- step 2: open a terminal in IDE, CMD etc. and go to this path "Security-Project-With-Spring-And-Angular/Spring/"
- step 3: run mvn clean install
- step 4: run java -jar target/Spring-0.0.1-SNAPSHOT.jar
- step 5: The application will be up at http://localhost:8080

Home before login or after logout

![Home before login or after logout](https://github.com/louissardaru/Security-Project-With-Spring-And-Angular/assets/119102199/153a6ae2-76be-487e-929d-741ec84f07c9)

Login page

![Login page](https://github.com/louissardaru/Security-Project-With-Spring-And-Angular/assets/119102199/0d748fc1-a3aa-445f-a445-7c4ab90c4b95)

Home page after login

![Home page after login](https://github.com/louissardaru/Security-Project-With-Spring-And-Angular/assets/119102199/0e9111b8-5646-4376-a38e-25f5fac41baa)
