package Colectii.Ex1PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<String> contacts;
    private List<String> blackList;

    public PhoneBook(List<String> contacts, List<String> blackList) {
        this.contacts = new ArrayList<>(contacts);
        this.blackList = new ArrayList<>(blackList);
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    public List<String> getBlackList() {
        return blackList;
    }

    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }

    public static List<String> filterContacts(List<String> validContacts, List<String> blockedContacts) {
        validContacts.removeAll(blockedContacts);
        return validContacts;
    }

    public void addToBlackList(String number) {
        if (contacts.contains(number)) {
            contacts.remove(number);
        }
        if (!blackList.contains(number)) {
            blackList.add(number);
        }
    }

    public void removeFromBlackList(String number) {
        if (blackList.contains(number)) {
            blackList.remove(number);
        }
        if (!contacts.contains(number)) {
            contacts.add(number);
        }
    }
}