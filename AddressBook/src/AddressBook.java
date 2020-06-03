import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	private List<AddressBookEntry> listOfEntries;
	Scanner sc = new Scanner(System.in);

	public AddressBook() {
		this.listOfEntries = new ArrayList<>();
	}

	public void add(AddressBookEntry addressBookEntry) {
		this.listOfEntries.add(addressBookEntry);
	}

	public void delete(int index) {

		this.listOfEntries.remove(index);
		System.out.println("Enter First Name of contact that you would like to edit: ");
		int index1 = sc.nextInt();
	}

	public AddressBookEntry update(int index) {
		return ((AddressBook) this.listOfEntries).update(index);
	}

	public AddressBookEntry[] viewAll() {
		AddressBookEntry[] result = new AddressBookEntry[this.listOfEntries.size()];
		this.listOfEntries.toArray(result);
		return result;
	}

}