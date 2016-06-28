package com.example;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Contact;

@RestController
@RequestMapping("/contact")
public class RestServiceController {

	 @Autowired
	    private ContactRepository repo;
	 
	 // POST
	    @RequestMapping(method = RequestMethod.POST)
	    public String createContact(@RequestBody @Valid final Contact contact) {
	        
	        try {
	            repo.save(contact);
	        } catch (Exception e) {
	            return e.getMessage();
	        }
	        return "creation successful: " + String.valueOf(contact.getPhoneNumber());
	    }
	 
	    // GET
	    @RequestMapping(value="/{phoneNumber}",method = RequestMethod.GET)
	    public Contact getContact(@PathVariable("phoneNumber") String phoneNumber) {
	        Contact contact=null;
	           contact = repo.findOne(phoneNumber);
	            return contact;
	        	}
	 
}
