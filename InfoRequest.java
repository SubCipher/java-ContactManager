package com.stepwisedesign;
import java.util.Scanner;

public class InfoRequest {

    void interactiveRequest(){
        //create new instance of a ContactManager
        ContactManager myContactManager = new ContactManager();

        //create new instance of a Scanner object
        Scanner userInput = new Scanner(System.in);

        //create new instance of Contact
        Contact newContact = new Contact();

        System.out.println("enter first name ");
        String contactFirstName = userInput.nextLine();

        System.out.println("enter last name");
        String contactLastName = userInput.nextLine();

        System.out.println("enter phone number ");
        String contactPhoneNumber = userInput.nextLine();

        //use constructor to initialize contact.  This is used instead of setter -> void setFirstName(){etc...}
        newContact.contact(contactFirstName,contactLastName,contactPhoneNumber);

        //call method addContact to access (add contact object to) contact array.
        myContactManager.addContact(newContact);

    }
}
