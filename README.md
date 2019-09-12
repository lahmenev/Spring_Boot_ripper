# This is Spring Boot ripper example

Little bit discriptions:

1) First of all this example works with own starter with any configurations. 
You can find this starter in boot-ripper-starter repository and add it as dependancy in pom.xml

2) This example contains DeveloperService bean with schediling. It crates only with active profile "DEV" (@Profile("DEV")).
boot-ripper-starter responsible for logic sets activ profile. 

3) Next stage is adding bean ProdNotificationListener. It has the same name as boot-ripper-starter bean that responsible for 
sending email on console. It is same logic as we have custom DataSource configuration in Spring Boot. In this case Spring disable default configeration


#Getting started


- git clone 
- mvn install
- git clone https://github.com/lahmenev/Spring_Boot_ripper.git
- mvn spring-boot:run
