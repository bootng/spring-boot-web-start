
# Spring Boot + Thymeleaf Web App

Spring boot application with Thymeleaf as the template engine. This small working applicaiton contains two pages
1) Login page : Renders the login page
2) Blog List Page: Renders the Blog List page. 
This application does not access any database, it returns list of Blogs from Java.

# Technologies Used
Spring Boot 2.2.6.RELEASE <br>
Thymeleaf <br>
Java 10 <br>
Bootstrap v4.1.3 <br>

## 1. How to build
```
$ mvn clean install

```


## 2. How to start
```
$ mvn spring-boot:run

```

## 2. Access the Application
```
http://localhost:8080/login
http://localhost:8080/blog

```

![Login Page](https://1.bp.blogspot.com/-oLw2SUSoQ-4/XrSTR-jimCI/AAAAAAAAAQE/bKrgBlzD0FU2su4MUOzAEVItYkMie0BIQCLcBGAsYHQ/s640/spring-boot-web-login.png)


![Blog Index Page](https://4.bp.blogspot.com/-vrlsIQhQnBE/XrSTR7ncNEI/AAAAAAAAAQQ/3TrcnXtS8eMii75PhM9Hv9KWt3I5AYyEgCPcBGAYYCw/s1600/spring-boot-web-blog.png)
