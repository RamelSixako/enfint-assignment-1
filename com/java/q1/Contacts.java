package com.java.q1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contacts {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Map<String, List<String>> contacts = new HashMap();

	public void addNewContact(String name, String phoneNumber) {
		List<String> list = new ArrayList<String>();
		if (contacts.containsKey(name)) {
			list = contacts.get(name);
			if (list.contains(phoneNumber)) {
				return;
			}
			return;
		}
		list.add(phoneNumber);
		contacts.put(name, list);
	}

	public List<String> searchContactByText(String name) {
		List<String> result = new ArrayList<String>();
		for (String key : contacts.keySet()) {
			if (key.toLowerCase().contains(name.toLowerCase())) {
				for (String phoneNumbers : contacts.get(key)) {
					result.add(phoneNumbers);
				}
			}
		}
		return result;
	}

	public List<String> getContactsByName(String name) {
		List<String> result = contacts.getOrDefault(name, List.of());
		return result;
	}

	public void displayContacts() {
		for (String key : contacts.keySet()) {
			System.out.printf("Name: %s , Phone Numbers: %s ", key, this.getContactsByName(key).toString()).println();
			;
		}

	}
}
