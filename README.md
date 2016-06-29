Spring Boot RESTful Web Service  
==============================
Demo application for Restful Web Serivce based on Spring Boot.

Application Deployed to AWS, To use the application can visit
http://ec2-52-35-156-118.us-west-2.compute.amazonaws.com/Ascendum/contact/5132234233

To setup on local server:
Deploy the war on java web server with port 8080 and create a mysql db with following details.

spring.datasource.url = jdbc:mysql://localhost:3306/ascendum<br /> 
spring.datasource.username = root<br /> 
spring.datasource.password = root<br /> 

db table create query: CREATE TABLE `contact` ( `phone_number` bigint(20) NOT NULL, `first_name` varchar(255) DEFAULT NULL, `last_name` varchar(255) DEFAULT NULL)

## How-to use this code

Use restful web service client like Postman to test this application

To add a contact <br /> 
Request: Method:POST, URI: http://ec2-52-35-156-118.us-west-2.compute.amazonaws.com/Ascendum/contact, Body:{ "firstName": "john","lastName": "doe","phoneNumber":"5132234233" }<br /> 
Response: creation successful: 5132234233 (details will be saved into database)<br /> 

To retrieve a contact <br /> 
Request: Method:GET, URI: http://ec2-52-35-156-118.us-west-2.compute.amazonaws.com/Ascendum/contact/5132234233 <br /> 
Response: { "firstName": "john","lastName": "doe","phoneNumber":"5132234233" } <br /> 

#### Screenshot
![Screenshot software](https://github.com/ramidi45/Spring-Boot-Rest-WebService-MySql/blob/master/post.PNG "rest webservice post")

![Screenshot software](https://github.com/ramidi45/Spring-Boot-Rest-WebService-MySql/blob/master/get.PNG "rest webservice get")

![Screenshot software](https://github.com/ramidi45/Spring-Boot-Rest-WebService-MySql/blob/master/testcases.PNG "unit testing webservice")


## Contact
* e-mail: ramiditarunreddy@hotmail.com
* Linkedin: [Tarun@LinkedIn](https://www.linkedin.com/in/tarun-reddy-ramidi-66a002104 "Tarun Reddy on LinkedIn")


