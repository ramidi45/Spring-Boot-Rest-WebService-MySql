package com.example;

import org.springframework.data.repository.CrudRepository;

import com.example.models.Contact;

public interface ContactRepository extends CrudRepository<Contact, String> {

}
