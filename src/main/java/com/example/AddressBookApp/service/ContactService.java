package com.example.AddressBookApp.service;

import com.example.AddressBookApp.entity.Contact;
import com.example.AddressBookApp.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    @Autowired
    private ContactRepository repository;

    public Contact addContact(Contact contact) {
        return repository.save(contact);
    }

    public List<Contact> getAllContacts() {
        return repository.findAll();
    }

    public Optional<Contact> getContactById(Long id) {
        return repository.findById(id);
    }

    public Contact updateContact(Long id, Contact updatedContact) {
        return repository.findById(id).map(contact -> {
            contact.setName(updatedContact.getName());
            contact.setPhone(updatedContact.getPhone());
            contact.setEmail(updatedContact.getEmail());
            return repository.save(contact);
        }).orElse(null);
    }

    public boolean deleteContact(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
