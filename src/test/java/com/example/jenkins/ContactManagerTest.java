package com.example.jenkins;

import com.example.jenkins.entity.Contact;
import com.example.jenkins.utility.ContactManager;
import org.junit.jupiter.api.*;

public class ContactManagerTest {

    private ContactManager contactManager;

    @BeforeEach
    public void setupData() {
        System.out.println("Inside before each");
        contactManager = new ContactManager();

    }

    @Test
    @DisplayName("Test case for Creating the contact successfully")
    public void shouldCreateContact() {
        contactManager.addContact("mahesh", "kumar", "9974678987");
        Assertions.assertEquals(1, contactManager.getAllContacts().size());
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
    }

    @Test
    @DisplayName("Test case for not creating conatct when first name is empty")
    public void validateFirstNameisEmpty() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            contactManager.addContact(null, "kumar", "89876565467");
        });
    }

    @Test
    @DisplayName("Test case for not creating conatct when last name is empty")
    public void validateLastNameisEmpty() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            contactManager.addContact("mohan", null, "89876565467");
        });
    }
}
