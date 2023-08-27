# JS Object Data Persistence via Spring Boot BackEnd <img src="assets/logo.png" alt="drawing" width="27px"/>

This project demonstrates of saving entire **large js object** to a **relational DBMS** via **spring boot** backend.
In here sample large js object includes **all the details of a company profile**, and it is saved as a **one single record** 
to the **company_profile** database table. **company_profile** database table can be used to 
save any number of company details.

The sample company profile hierarchy is as follows,

<img src="assets/company_hierarchy.png" alt="splash-screen" width="900px"/>


In this project, **company profiles web service** is exposed as an **API** under the **company profiles** resource and more information on the company profile web 
service can be found in the below API documentation.

- [**Company Profiles API documentation**](https://documenter.getpostman.com/view/25306703/2s9Y5YS34g)

## Used Technologies

- Java SE 11
- Spring Boot 2.7.8
- Apache Maven 3.8.6
- MySQL Community Server 8.0.31
- Added dependencies to pom.xml
    - spring-boot-starter-web 2.7.8
    - spring-boot-starter-data-jpa 2.7.8
    - spring-boot-starter-aop 2.7.8
    - spring-boot-starter-test 2.7.8
    - spring-boot-devtools
    - lombok 1.18.24
    - mysql-connector-j 8.0.31
    - modelmapper 3.1.0

#### Used Integrated Development Environment
- IntelliJ IDEA

## How to use ?
This project can be used by cloning the 
project to your local computer.

Make sure to create a **db** database in the MySQL community server.
If neglect to create, the project will automatically generate it when it is firstly executed.

#### Clone this repository
1. Clone the project using `https://github.com/PubuduJ/js-object-data-persist.git` terminal command.
2. Open the `pom.xml` file from **IntelliJ IDEA**, make sure to open this as a project.
3. Change the `spring.datasource.password` in the `application.properties` to your local machine MySQL server password.

## Version
v1.0.0

## License
Copyright &copy; 2023 [Pubudu Janith](https://www.linkedin.com/in/pubudujanith/). All Rights Reserved.<br>
This project is licensed under the [MIT license](LICENSE.txt).