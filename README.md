Spring Boot RESTful Web Service  
==============================
Demo application for Restful Web Serivce based on Spring Boot.

## How-to use this code

Use restful web service client like Postman to test this application

To add a contact <br /> 
Request: Method:POST, URI:http://localhost:8080/contact, Body:{ "firstName": "john","lastName": "doe","phoneNumber":"5132234233" }<br /> 
Response: creation successful: 5132234233 (details will be saved into database)<br /> 

To retrieve a contact <br /> 
Request: Method:GET, URI::http://localhost:8080/contact/5132234233 <br /> 
Response: { "firstName": "john","lastName": "doe","phoneNumber":"5132234233" } <br /> 

#### Screenshot
![Screenshot software](https://github.com/ramidi45/Spring-Boot-Rest-WebService-MySql/blob/master/post.PNG "rest webservice post")

![Screenshot software](https://github.com/ramidi45/Spring-Boot-Rest-WebService-MySql/blob/master/get.PNG "rest webservice get")

![Screenshot software](https://github.com/ramidi45/Spring-Boot-Rest-WebService-MySql/blob/master/testcases.PNG "unit testing webservice")


## Contact
* e-mail: ramiditarunreddy@hotmail.com
* Linkedin: [Tarun@LinkedIn](https://www.linkedin.com/in/tarun-reddy-ramidi-66a002104 "Tarun Reddy on LinkedIn")


