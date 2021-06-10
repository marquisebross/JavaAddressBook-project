package com.company;


import java.util.Scanner;

import com.company.addressbook.AddyBook;


public class Main {

    public static void main(String[] args) {



        AddyBook addressBook = new AddyBook();
        Scanner scanner = new Scanner(System.in);
        
        String input, s;
        int cs;
        while (true) {

            

        System.out.println("1) Add an entry");
        System.out.println("2) Remove an entry");
        System.out.println("3) Search for a specific entry");
        System.out.println("4) Print Address Book");
        System.out.println("5) Delete Book");
        System.out.println("6) Quit");
        System.out.println();

            System.out.println("Please choose what you'd like to do with the database:");

            input = scanner.next();
            cs = Integer.parseInt(input);


            switch (cs) {
                case 1:
                    addressBook.addEntry();
                    break;

                case 2:
                    System.out.println("Enter an entry's email to remove: ");
                    s = scanner.next();
                    addressBook.deleteEntry(s);
                    break;

                case 3:
//                    System.out.println("Enter name to search: ");
                    System.out.println("1) First Name ");
                    System.out.println("2) Last Name ");
                    System.out.println("3) Phone Number ");
                    System.out.println("4) Email Address ");
                    System.out.println("Choose a search type: ");
                    input = scanner.next();
                    cs = Integer.parseInt(input);

                    switch (cs) {
                        case 1:
                            System.out.println("Enter your search: ");
                            s = scanner.next();
                            addressBook.searchEntry1(s);
                            break;
                        case 2:
                            System.out.println("Enter your search: ");
                            s = scanner.next();
                            addressBook.searchEntry2(s);
                            break;
                        case 3:
                            System.out.println("Enter your search: ");
                            s = scanner.next();
                            addressBook.searchEntry3(s);
                            break;
                        case 4:
                            System.out.println("Enter your search: ");
                            s = scanner.next();
                            addressBook.searchEntry4(s);
                            break;
                        default:
                            System.out.println("Not a number 1-4");



                    }
                            break;


                case 4:
                    addressBook.printEntries();
                    break;

                case 5:
                    System.out.println("Book is cleared!");
                    addressBook.deleteBook();
                    break;

                case 6:
                    System.exit(0);

            }



        }
    }
}

