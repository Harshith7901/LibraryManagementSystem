package LibraryManagementSystem;

import java.util.Scanner;

public class AddBook implements IOOperation {

	@Override
	public void oper(Database database, User user) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Book book = new Book();
		System.out.println("Enter book name: ");
		book.setName(scan.next());
		System.out.println("Enter book author: ");
		book.setAuthor(scan.next());
		System.out.println("Enter book publisher: ");
		book.setPublisher(scan.next());
		System.out.println("Enter book collection address: ");
		book.setAddress(scan.next());
		System.out.println("Enter book qty: ");
		book.setQty(scan.nextInt());
		System.out.println("Enter price: ");
		book.setPrice(scan.nextDouble());
		System.out.println("Enter borrowing copies:  ");
		book.setBrwcopies(scan.nextInt());
		database.AddBook(book);
		System.out.println("Book added successfully");
		user.menu(database, user);
	}
}
