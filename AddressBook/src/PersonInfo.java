
import java.util.Scanner;

public class PersonInfo {

	private static String firstname;
	private static String lastname;
	private static String address;
	private static String city;
	private static String state;
	private static int mobilenumber1;
	private static int zipcode;

	public static void main(String[] args) {

		String input;
		Scanner in = new Scanner(System.in);

		AddressBook addressBook = new AddressBook();

		do {
			System.out.println("1. Add an Entry");
			System.out.println("2. Delete an Entry");
			System.out.println("3. View All Entries");
			System.out.println("4. Update an Entry");
			System.out.println("5. Exit");
			System.out.print("Please enter Choices from 1 to 5: \n");
			input = (in.next());

			switch (input) {
			case "1":

				AddressBookEntry entry = new AddressBookEntry(firstname, lastname, address, city, state, mobilenumber1,
						zipcode);

				System.out.print("First Name: ");
				Scanner sc = new Scanner(System.in);
				entry.setFirstname(sc.nextLine());

				System.out.print("Last Name: ");
				entry.setLastname(sc.nextLine());

				System.out.print("Address: ");
				entry.setAddress(sc.nextLine());

				System.out.print("City: ");
				entry.setCity(sc.nextLine());

				System.out.print("State: ");
				entry.setState(sc.nextLine());

				System.out.print("Mobile Number: ");
				entry.setMobilenumber1(sc.nextInt());

				System.out.print("Zip Code: ");
				entry.setZipcode(sc.nextInt());

				addressBook.add(entry);

				System.out.println("Added a new entry.");
				break;

			case "2":
				System.out.println("Enter the index of the entry, which you want to delete:");
				addressBook.delete(in.nextInt());

				break;

			case "3":
				System.out.println("Your addressbook contains the following entries:");
				AddressBookEntry[] listOfEntries = addressBook.viewAll();

				for (int i = 0; i < listOfEntries.length; i++) {
					System.out.println(listOfEntries[i].toString());
				}

				break;
			case "4":
				System.out.println("Enter the index of the entry, which you want to update:");
				AddressBookEntry entryToUpdate = addressBook.update(in.nextInt());

				System.out.print("First Name (current: " + entryToUpdate.getFirstname() + "):");
				entryToUpdate.setFirstname(in.next());

				System.out.print("Last Name (current: " + entryToUpdate.getLastname() + "):");
				entryToUpdate.setLastname(in.next());

				System.out.print("Address (current: " + entryToUpdate.getAddress() + "):");
				entryToUpdate.setAddress(in.next());

				System.out.print("City: (current: " + entryToUpdate.getCity() + "):");
				entryToUpdate.setCity(in.next());

				System.out.print("State: (current: " + entryToUpdate.getState() + "):");
				entryToUpdate.setState(in.next());

				System.out.print("Mobile Number1: (current: " + entryToUpdate.getMobilenumber1() + "):");
				entryToUpdate.setMobilenumber1(in.nextInt());

				System.out.print("Zip Code: (current: " + entryToUpdate.getZipcode() + "):");
				entryToUpdate.setZipcode(in.nextInt());

				break;

			default:
				break;
			}

		} while (!input.equals("5"));
	}

}