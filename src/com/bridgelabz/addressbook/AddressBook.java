package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<ContactInfo> contactList = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public void setUpInfo() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many contacts you want to create");
        int count = in.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.println("Enter the First Name:");
            String firstname = in.next();
            System.out.println("Enter the Last Name:");
            String lastname = in.next();
            System.out.println("Enter the Address in words:");
            String address = in.next();
            System.out.println("Enter the City:");
            String city = in.next();
            System.out.println("Enter the State Name:");
            String state = in.next();
            System.out.println("Enter the Pincode code:");
            int zip = in.nextInt();
            System.out.println("Enter the Phone No");
            long phone = in.nextLong();
            System.out.println("Enter email id:");
            String email = in.next();

            ContactInfo contact = new ContactInfo(firstname, lastname, address, city, state, zip, phone, email);
            contactList.add(contact);
        }
    }

    public void displayListItems() {
        for (ContactInfo data : contactList) {
            System.out.println
                    (data.getFirstName() + "  " + data.getLastName() + "  "
                    + data.getAddress() + "  " + data.getCity() + "  " + data.getState() + "  "
                    + data.getZip() + "  " + data.getPhoneNumber() + "  " + data.getEmail());
        }
    }

    public void editContact() {
        System.out.println("Enter the first name of the contact to be edited");
        String newName = in.next();
        for (ContactInfo data : contactList) {
            if (data.getFirstName().contains(newName)) {
                int index = contactList.indexOf(data);
                System.out.println(data.getFirstName() + "  " + data.getLastName() + "  "
                        + data.getAddress() + "  " + data.getCity() + "  " + data.getState()
                        + "  " + data.getZip() + "  " + data.getPhoneNumber() + "  " + data.getEmail());

                System.out.println("Enter the First Name:");
                String firstname = in.next();
                System.out.println("Enter the Last Name:");
                String lastname = in.next();
                System.out.println("Enter the Address in words:");
                String address = in.next();
                System.out.println("Enter the City:");
                String city = in.next();
                System.out.println("Enter the State Name:");
                String state = in.next();
                System.out.println("Enter the Pincode code:");
                int zip = in.nextInt();
                System.out.println("Enter the Phone No");
                long phone = in.nextLong();
                System.out.println("Enter email id:");
                String email = in.next();

                contactList.set(index, new ContactInfo(firstname, lastname, address, city, state, zip, phone, email));
                displayListItems();
            }
        }
    }
}