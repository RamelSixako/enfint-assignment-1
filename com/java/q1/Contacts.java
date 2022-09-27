package com.java.q1;

import java.util.ArrayList;
import java.util.HashMap;

public class Contacts {

	HashMap<String, ArrayList<String>> contacts;

	/**
	 * @return the contacts
	 */
	public HashMap<String, ArrayList<String>> getContacts() {
		return contacts;
	}

	public boolean addNewContact(String name, String phonenNumber) {
		if (contacts.containsKey(name)) {
			ArrayList<String> currentList = contacts.get(name);
			if (currentList.contains(phonenNumber)) {
				return false;
			}

			currentList.add(phonenNumber);
			contacts.put(name, currentList);
			return true;

		}
		ArrayList<String> newPhoneNumbers = new ArrayList<String>();
		newPhoneNumbers.add(phonenNumber);
		contacts.put(name, newPhoneNumbers);
		return true;
	}

	public ArrayList<String> searchContactBytext(String name) {
		ArrayList<String> result = new ArrayList<String>();
		for (String key : contacts.keySet()) {
			if (key.toLowerCase().contains(name.toLowerCase())) {
				for (String phoneNumbers : contacts.get(key)) {
					result.add(phoneNumbers);
				}
			}
		}
		if (result.isEmpty()) {
			return null;
		}
		return result;

	}

	public ArrayList<String> getContactsByName(String name) {
		ArrayList<String> result = new ArrayList<String>();
		for (String key : contacts.keySet()) {
			if (key.toLowerCase().contentEquals(name.toLowerCase())) {
				for (String phoneNumbers : contacts.get(key)) {
					result.add(phoneNumbers);
				}
			}
		}
		if (result.isEmpty()) {
			return null;
		}
		return result;

	}

	/**
	 * @param contacts
	 */
	public Contacts() {
		this.contacts = new HashMap<String, ArrayList<String>>();
	}

	public void displayContacts() {
		for (String key : contacts.keySet()) {
			System.out.printf("Name: %s , Phone Numbers: %s ", key, this.getContactsByName(key).toString()).println();
			;
		}

	}
}
