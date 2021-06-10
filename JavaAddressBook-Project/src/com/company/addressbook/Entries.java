package com.company.addressbook;



public class Entries {


    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

//create entry object with parameters
    public Entries (String f, String l, String p, String e){
        setFirstName(f);
        setLastName(l);
        setPhoneNumber(p);
        setEmailAddress(e);
    }


//getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String sFirstName) {
        firstName = sFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String LastName) { lastName = LastName; }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String sPhoneNumber) {
        phoneNumber = sPhoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String sEmailAddress) {
        emailAddress = sEmailAddress;
    }

// override the toString() method so that the entries can be printed in an easy-to-read-manner
    @Override
    public String toString() {
        return  "First Name : " + firstName + '\n' +
                "Last Name : " + lastName + '\n' +
                "Phone Number : " + phoneNumber + '\n' +
                "Email Address :" + emailAddress + '\n' +
                " ";
    }



}
