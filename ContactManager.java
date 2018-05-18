package com.stepwisedesign;

public class ContactManager {

    private int count = 0;
    private Contact[] contactArray = new Contact[20];

    public void addContact (Contact personalContact){
      contactArray[count] = personalContact;
      count++;

      //for-each loop syntax: [ for (type var : array) ]
        for (Contact contact: contactArray) {
            if(contact != null){
                System.out.println(contact.getFirstName() + " " + contact.getLastName() + " " + contact.getPhoneNumber() );
            }
        }
/*
Long for loop
for(int i = 0; i < contactArray.length; i++){
if(contactArray[i] != null){
System.out.println(contactArray[i].getFirstName());
System.out.println(contactArray[i].getLastName());
System.out.println(contactArray[i].getPhoneNumber());
System.out.println(contactArray[i]);
}
}
*/
    }

  public void searchContacts(Contact personalContact){

      for(int i = 0; i < contactArray.length; i++){
          if (contactArray[i].getFirstName().equals(personalContact.getFirstName())){
              System.out.println("found contact named " + personalContact.getFirstName() + " at index " + i);
          }
      }
  }
}
