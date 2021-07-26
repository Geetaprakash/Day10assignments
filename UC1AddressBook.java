//package com.company;

import java.util.ArrayList;

class UC1AddressBook {
    public static void main(String[] args) {
        System.out.println("ADDRESSBOOK DETAILS ARE BELOW\n");
        ArrayList<String> Firstname = new ArrayList<String>();
        //adding elements to arraylist
        Firstname.add("Geeta");
        Firstname.add("Prakash");
        Firstname.add("Soumya");

        ArrayList<String> Lastname = new ArrayList<String>();
        Lastname.add("Biradar");
        Lastname.add("Patil");
        Lastname.add("Gowda");

        ArrayList<String> Address = new ArrayList<String>();
        Address.add("Banglore");
        Address.add("mysore");
        Address.add("Mandya");

        ArrayList<String> State = new ArrayList<String>();
        State.add("karanatak");
        State.add("karanatak");
        State.add("karanatak");

        ArrayList<Integer> Zip = new ArrayList<>();
        Zip.add(565008);
        Zip.add(565007);
        Zip.add(560769);

        ArrayList<String> Email = new ArrayList<String>();
        Email.add("geeta@gmail.com");
        Email.add("prakash@gmail.com");
        Email.add("soumya@gmail.com");

        //changing element
        System.out.println("INITIAL ARRAYLIST FIRSTNAME\n" +Firstname);
        Firstname.set(2, "Swati");
        System.out.println("UPDATED ARRAYLIST FIRSTNAME\n" +Firstname);

        //removing elements
        System.out.println("INITIAL ARRAYLIST STATE\n" +State);
        State.remove("karanatak");
        System.out.println("UPDATED ARRAYLIST STATE\n" +State);

        //displaying elements
        System.out.println("Firstname:" + Firstname);
        System.out.println("Lastname:" + Lastname);
        System.out.println("Address:" + Address);
        System.out.println("State:" + State);
        System.out.println("Zip:" + Zip);
        System.out.println("Email:" + Email);
        }
    }
