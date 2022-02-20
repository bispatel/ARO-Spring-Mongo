package com.driev.portal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.driev.portal.model.ContactForm;

@Repository
public interface ContactRepository extends MongoRepository<ContactForm, String>{

	ContactForm findByContact(String contact);

}
