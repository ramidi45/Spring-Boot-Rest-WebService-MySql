package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.example.models.Contact;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AscendumApplication.class)
@WebIntegrationTest

public class RestServiceControllerTests {

	public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	 @Autowired
	  private ContactRepository repo;
	 
	 @Test
	 public void testCreateContact() throws JsonProcessingException{

	   //Building the Request body data
		 
				Contact requestBody = new Contact();
				requestBody.setPhoneNumber("5138868729");
				requestBody.setFirstName("Tarun Reddy");
				requestBody.setLastName("Ramidi");
				
			
	   HttpHeaders requestHeaders = new HttpHeaders();
	   requestHeaders.setContentType(MediaType.APPLICATION_JSON);

	   HttpEntity<String> httpEntity =
	       new HttpEntity<String>(OBJECT_MAPPER.writeValueAsString(requestBody), requestHeaders);

	   //Invoking the post web service
	   RestTemplate restTemplate = new RestTemplate();
	   String postResponse =restTemplate.postForObject("http://localhost:8080/contact", httpEntity, String.class);

	   //Asserting the response of the API.
	   assertNotNull(postResponse);
	   assertEquals("creation successful for phoneNumber: 5138868729", postResponse);
	   
	 }

	 @Test
	 public void testRetrieveContact() throws JsonProcessingException{

	   //Building the Request body data
		 
				Contact requestBody = new Contact();
				requestBody.setPhoneNumber("5138868729");
				requestBody.setFirstName("Tarun Reddy");
				requestBody.setLastName("Ramidi");

	   //Invoking the post web service
	   RestTemplate restTemplate = new RestTemplate();
	   Contact getResponse =restTemplate.getForObject("http://localhost:8080/contact/5138868729", Contact.class);
	   assertNotNull(getResponse);
	   assertEquals(requestBody.getFirstName(), getResponse.getFirstName());
	   assertEquals(requestBody.getLastName(), getResponse.getLastName());
	   assertEquals(requestBody.getPhoneNumber(), getResponse.getPhoneNumber());
	   
	   //Delete the data added for testing
	   repo.delete("5138868729");

	 }

}
