package jdbc_maven_wejm5;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		Scanner scanner = new Scanner(System.in);

		Person person = new Person();

		PersonCRUD crud = new PersonCRUD();

		boolean condition = true;

		do {
			System.out.println(
					"Enter the choice \n1. Save Person \n2. Update Person \n3. Delete Person \n4. Get Person By Id \n5. Get All Persons \n6. Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the id");
				int id = scanner.nextInt();
				System.out.println("Enter the name");
				String name = scanner.next();
				System.out.println("Enter the phone");
				long phone = scanner.nextLong();

				person.setId(id);
				person.setName(name);
				person.setPhone(phone);

				crud.savePerson(person);
			}
				break;
			case 2: {
				System.out.println("Enter the id");
				int id = scanner.nextInt();
				System.out.println("Enter the name");
				String name = scanner.next();
				System.out.println("Enter the phone");
				long phone = scanner.nextLong();

				person.setId(id);
				person.setName(name);
				person.setPhone(phone);

				crud.updatePerson(person);
			}
				break;
			case 3: {
				System.out.println("Enter the id");
				int id = scanner.nextInt();

				crud.deletePerson(id);
			}
				break;
			case 4: {
				System.out.println("Enter the id");
				int id = scanner.nextInt();

				crud.getPersonById(id);
			}
				break;
			case 5: {
				crud.getAllPersons();
			}
				break;
			default:
				condition = false;
			}
		} while (condition);
	}

}
