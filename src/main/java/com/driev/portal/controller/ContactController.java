package com.driev.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.driev.portal.exception.ResourceNotFoundException;
import com.driev.portal.model.ContactForm;
import com.driev.portal.repository.ContactRepository;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class ContactController {

	@Autowired
	private ContactRepository contactRepo;

	@PostMapping("/saveQuery")
	public ContactForm saveContactDetails(@RequestBody ContactForm contact) {
		return contactRepo.save(contact);
	}

	@GetMapping("/getQueries")
	public List<ContactForm> getContactDetails() {
		return contactRepo.findAll();
	}

	@GetMapping("/getQueries/{id}")
	public ResponseEntity<ContactForm> getEmployeeById(@PathVariable(value = "id") String contact)
			throws ResourceNotFoundException {
		ContactForm employee = contactRepo.findByContact(contact);

		return ResponseEntity.ok().body(employee);
	}

}
