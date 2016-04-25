About this project
----------------
This is a spring data integrated with JPA demo.

Follow belong tutorials:
- A very simple demo (without using spring data):  
http://www.journaldev.com/7655/spring-orm-example-with-jpa-hibernate-transactions
- An advanced demo using spring data:  
http://fruzenshtein.com/spring-jpa-data-hibernate-mysql/

**JPA implementation without spring data**
- use JpaConfiguration instead of HibernateConfiguration
- user JpsUserDao instead of UserDao

**JPA implementation with spring data**
- JpaConfiguration.java declares @EnableJpaRepositories
- declares UserRepository in package org.oursight.learning.jpa.repository
- Use UserRepository in JpaController, which url mapping to http://localhost:8080/jpa/list and jpa/new


How to build
------------


How to run
-----------------
1. checkout from git

2. mvn jetty:run  
If you want to run it in Tomcat, make sure that you are using the version above Tomcat 8.0 -- no need of web.xml at all

3. open your browser and access http://localhost:8080
just follow the yellow brick road




References
----------
- Spring data offical reference  
  http://docs.spring.io/spring-data/commons/docs/current/reference/html/
- https://github.com/Fruzenshtein/spr-data  
  http://fruzenshtein.com/spring-mvc-hibernate-maven-crud/
  http://fruzenshtein.com/spring-jpa-data-hibernate-mysql/