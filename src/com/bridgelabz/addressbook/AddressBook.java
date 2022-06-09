package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    static List<ContactPerson> contactList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addContact() {
        System.out.println("Enter your first name");
        String firstName = sc.next();
        System.out.println("Enter your last name");
        String lastName = sc.next();
        System.out.println("Enter your city name");
        String city = sc.next();
        System.out.println("Enter your state");
        String state = sc.next();
        System.out.println("Enter your zip code");
        long zip = sc.nextLong();
        System.out.println("Enter your phone number");
        long phoneNumber = sc.nextLong();
        System.out.println("Enter your email");
        String email = sc.next();

        ContactPerson addressBook = new ContactPerson(firstName, lastName, city, state, zip, phoneNumber, email);
        contactList.add(addressBook);
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome To The Address Book Program");
        addContact();
        System.out.println(contactList);
    }
}