package com.example.jenkins.utility;

import com.example.jenkins.entity.Contact;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContactManager {
    Map<String, Contact> contactList = new ConcurrentHashMap<String, Contact>();

    public void addContact(String firstName, String lastName, String contactNo){
        Contact contact = new Contact(firstName,lastName,contactNo);
        validateContact(contact);
        checkIfContactAlreadyExists(contact);
        contactList.put(generateKey(contact),contact);
        
    }
    public Collection<Contact> getAllContacts()
    {
        return contactList.values();

    }

    private void checkIfContactAlreadyExists(Contact contact) {
        if(contactList.containsKey(generateKey(contact)))
            throw new RuntimeException("Contact already exists");
    }

    private void validateContact(Contact contact) {
        contact.validateFirstName();
        contact.validateLastName();
        contact.validateContactNo();
    }
    private  String generateKey(Contact contact){
        return String.format("%s-%s",contact.getFirstName(),contact.getLastName());
    }

}
