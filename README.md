# spring-demo-one
My first genuine attempt to thoroughly learn Spring framework. Following a Udemy Course created by Chad Darby
 
## Notes

### Day 1

AOP - Aspect Oriented Programming 
Data Access - JDBC
ORM - Hibernate / JPA
JMS - Java Message Service
Web layer - Spring MVC framework
JMX - Java Management Extension
TDD - Test Driven Development
Integration Test + JUnit

Spring 6 and Spring Boot 3 - uses jakarta.* instead of javax.*
Tomcat 9 and Spring 5 supports javax.* later versions supports jakarta.*
Apache Tomcat is a popular open source web server and Servlet container for Java code

repo.spring.io - repository for spring libraries

Using Java 11 - Eclipse - Tomcat 9

IoC (Inversion of Control) - Outsourcing the construction and managements of objects
Spring container == ApplicationContext
Spring Bean == Java Object inside a Spring Container.

Dependency Injection - the client delegates to calls to another project the responsibility of providing its dependecies. (You let your car factory build your car, no need to worry about how it is assembled.)
two injection types:
Constructor Injection
Setter Injection
Auto Wiring

Tip:
Ctrl Space = eclipse syntax shortcuts (sysout)
copy qualified class name = full class name from package

Bean Scopes - refers to the lifecycle of a bean.
Default of bean scope = Singleton.
Five Bean Scopes:
Singleton = one instance created only of the bean, cached in memory and shared in bean
Prototype = new bean instance for each request
Request = scoped on web request
Session = scoped on web session
Global-session = scoped to global web session

for prototype bean scope, spring does not call the destroy method. you will have to implement DisposableBean and override the destroy method (also throw an execption)
