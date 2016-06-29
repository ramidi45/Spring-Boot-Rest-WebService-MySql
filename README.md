Spring Boot RESTful Web Service  
==============================
Demo application for Restful Web Serivce based on Spring Boot.

## How-to use this code

#To add a contact
Request: Method:POST, URI:http://localhost:8080/contact, Body:{ "firstName": "john","lastName": "doe","phoneNumber":"5132234233" }
Response: creation successful: 5132234233 (details will be saved into database)

#To retrieve a contact
Request: Method:GET, URI::http://localhost:8080/contact/5132234233
Response: { "firstName": "john","lastName": "doe","phoneNumber":"5132234233" }

#### Screenshot
![Screenshot software](https://github.com/ramidi45/Spring-Boot-Rest-WebService-MySql/blob/master/post.PNG "rest webservice post")

![Screenshot software](https://github.com/ramidi45/Spring-Boot-Rest-WebService-MySql/blob/master/get.PNG "rest webservice get")


## Contact
* e-mail: ramiditarunreddy@hotmail.com
* Twitter: [@ImTarun45](https://twitter.com/ImTarun45 "ImTarun45 on twitter")


