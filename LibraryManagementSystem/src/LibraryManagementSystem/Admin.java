package LibraryManagementSystem;

import java.util.Scanner;

public class Admin extends User {

	public Admin(String name) {
		super(name);
		this.operations = new IOOperation[] { new ViewBooks(), new AddBook(), new DeleteBook(), new Search(),
				new DeleteAllData(), new ViewOrders(), new Exit() };
	}

	public Admin(String name, String email, String phoneNumber) {
		super(name, email, phoneNumber);
		// TODO Auto-generated constructor stub
		this.operations = new IOOperation[] { new ViewBooks(), new AddBook(), new DeleteBook(), new Search(),
				new DeleteAllData(), new ViewOrders(), new Exit() };

	}

	@Override
	public void menu(Database database, User user) {
		// TODO Auto-generated method stub
		System.out.println("1. View Books");
		System.out.println("2. Add Book");
		System.out.println("3. Delete Book");
		System.out.println("4. Search");
		System.out.println("5. Delete all data");
		System.out.println("6. View Orders");
		System.out.println("7. Exit");

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		this.operations[n - 1].oper(database, user);
		scan.close();
	}

	public String toString() {
		return name + "<N/>" + email + "<N/>" + phoneNumber + "<N/>" + "<N/>" + "Admin";
	}

}
