package com.company.addressbook;

import java.util.ArrayList;

import java.util.Scanner;


public class AddyBook {

    ArrayList<Entries> people;


    Scanner scanner = new Scanner(System.in);

    //    constructor
    public AddyBook() {
        people = new ArrayList<>();
    }

    //    add new entry to arraylist from input
    public void addEntry() {
        System.out.println("First Name: ");
        String fName = scanner.next();
        System.out.println("Last Name: ");
        String lName = scanner.next();
        System.out.println("Phone Number: ");
        String phone = scanner.next();
        System.out.println("Email Address: ");
        String email = scanner.next();


//        create new entry
        Entries g = new Entries(fName, lName, phone, email);
//          add the above entry to arraylist
        people.add(g);
        System.out.println(g);
        System.out.println("Added New Entry!");
    }

    //    search entry by first name
    public void searchEntry1(String f) {
        for (int i = 0; i < people.size(); i++) {
            Entries g = people.get(i);
            if (f.equals(g.getFirstName())) {
                System.out.println(g);
            }else {
                System.out.println("No name found");
            }
        }
    }

    //      search by last name
    public void searchEntry2(String l) {
        for (int i = 0; i < people.size(); i++) {
            Entries g = people.get(i);
            if (l.equals(g.getLastName())) {
                System.out.println(g);
            }else {
                System.out.println("No name found");
            }
        }
    }

    //      search by phonenumber
    public void searchEntry3(String p) {
        for (int i = 0; i < people.size(); i++) {
            Entries g = people.get(i);
            if (p.equals(g.getPhoneNumber())) {
                System.out.println(g);
            }else {
                System.out.println("No phone number found");
            }
        }
    }

    //      search by last email
    public void searchEntry4(String e) {
        for (int i = 0; i < people.size(); i++) {
            Entries g = people.get(i);
            if (e.equals(g.getEmailAddress())) {
                System.out.println(g);
            } else {
                System.out.println("No email address found");
            }
        }
    }

//        remove entry by email
        public void deleteEntry(String e) {
            for (int i = 0; i < people.size(); i++) {
                Entries g = people.get(i);
                if (e.equals(g.getEmailAddress())) {
                    System.out.println("Deleted the following entry: ");
                    System.out.println(g);
                    people.remove(i);
                } else {
                    System.out.println("No email address found");
                }
            }
        }

//        print all entries
    public void printEntries() {
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }

//    Delete Book using clear function
    public void deleteBook() {
        people.clear();
        }


    }

