package com.example.jenkins.entity;

public class Contact {
    private String firstName;
    private String lastName;
    private String contactNo;

    public Contact(String firstName, String lastName, String contactNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNo = contactNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void validateFirstName(){
        if(this.firstName.isBlank()){
            throw  new RuntimeException("First Name cant be empty");
        }
    }

    public void validateLastName(){
        if(this.lastName.isBlank()){
            throw  new RuntimeException("First Name cant be empty");
        }
    }
    public void validateContactNo(){
        if(this.contactNo.isBlank()){
            throw  new RuntimeException("First Name cant be empty");
        }
        if(this.contactNo.length() != 10){
            throw new RuntimeException("contact cant be empty");
        }
    }
    }
