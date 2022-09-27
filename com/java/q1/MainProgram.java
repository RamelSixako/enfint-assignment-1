package com.java.q1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Contacts contacts = new Contacts();
		System.out.print("Enter the number of contacts you want to enter: ");
		int numberContacts = scanner.nextInt();
		for (int i = 1; i <= numberContacts; i++) {
			System.out.println();
			System.out.print("Enter name: ");
			String name = scanner.next();
			System.out.print("Enter the phone number:  ");
			String phoneNumber = scanner.next();
			contacts.addNewContact(name, phoneNumber);
			System.out.println();
		}
		contacts.displayContacts();

		while (true) {
			System.out.print("Search for a certain contact or press enter to stop:");
			String search = scanner.next();
			if (search.length() < 0) {
				break;
			}
			ArrayList<String> result = contacts.searchContactBytext(search);
			if (result == null || result.isEmpty()) {
				System.out.println("No result for search " + search);
				continue;
			}
			System.out.printf("Result for search \' %s \' = %s ", search, result.toString()).println();
			;
		}
	}

}
