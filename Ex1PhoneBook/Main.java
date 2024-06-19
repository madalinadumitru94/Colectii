package Colectii.Ex1PhoneBook;
//1. Implementeaza un PhoneBook
//Atribute:
//contacts: o lista de String-uri reprezentand numere de telefon
//blackList: o lista de String-uri reprezentand numere de telefon blocate
//Metode:
//filterContacts()
//Metoda statica
//Acceptă ca și parametri:
//o lista de contacte valide
//o lista de contacte blocate
//Trebuie să șteargă din lista de contacte valide toate numerele care se regăsesc în lista de contacte blocate
//Returnează lista de contacte valide modificată
//addToBlackList()
//Metoda non-statică
//Adaugă numărul primit ca parametru în lista de numere blocate și îl șterge din lista de contacte
//removeFromBlackList()
//Metoda non-statică
//Adaugă numărul primit ca parametru în lista de numere și îl șterge din lista de numere blocate

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> contacts = new ArrayList<>();
        contacts.add("123456789");
        contacts.add("987654321");
        contacts.add("555555555");

        List<String> blackList = new ArrayList<>();
        blackList.add("987654321");

        // Creating a PhoneBook object
        PhoneBook phoneBook = new PhoneBook(contacts, blackList);

        // Filtering contacts
        List<String> filteredContacts = PhoneBook.filterContacts(phoneBook.getContacts(), phoneBook.getBlackList());
        System.out.println("Filtered Contacts: " + filteredContacts);

        // Adding a number to the blacklist
        phoneBook.addToBlackList("123456789");
        System.out.println("Contacts after adding to blacklist: " + phoneBook.getContacts());
        System.out.println("Blacklist after adding: " + phoneBook.getBlackList());

        // Removing a number from the blacklist
        phoneBook.removeFromBlackList("987654321");
        System.out.println("Contacts after removing from blacklist: " + phoneBook.getContacts());
        System.out.println("Blacklist after removing: " + phoneBook.getBlackList());
    }
}