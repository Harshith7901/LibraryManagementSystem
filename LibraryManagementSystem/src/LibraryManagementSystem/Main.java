package LibraryManagementSystem;

import java.util.Scanner;

public class Main {

	static Scanner scan;
	static Database database;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		database = new Database();
		System.out.println("Welcome to Library Management System!");

		int num;
//		do {
		System.out.println("0. Exit\n1. Login\n2. New User");
		scan = new Scanner(System.in);
		num = scan.nextInt();

		switch (num) {
		case 1:
			login(); // break;
		case 2:
			newUser(); // break;
//					default : System.out.println("Error!");
		}
//		}	while(num != 0);

	}

	private static void login() {
		// TODO Auto-generated method stub
		System.out.println("Enter phone number");
		String phoneNumber = scan.next();
		System.out.println("Enter Email");
		String email = scan.next();
		int n = database.login(phoneNumber, email);
		if (n != -1) {
			User user = database.getUser(n);
			user.menu(database, user);
		} else {
			System.out.println("User doesn't exist!");
		}
	}

	private static void newUser() {
		// TODO Auto-generated method stub
		System.out.println("Enter Name");
		String name = scan.next();
		System.out.println("Enter phone number");
		String phoneNumber = scan.next();
		System.out.println("Enter Email");
		String email = scan.next();

		System.out.println("1. Admin\n2. Normal User");
		int n2 = scan.nextInt();
		User user;
		if (n2 == 1) {
			user = new Admin(name, email, phoneNumber);
		} else {
			user = new NormalUser(name, email, phoneNumber);
		}
		database.AddUser(user);
		user.menu(database, user);
	}

}
