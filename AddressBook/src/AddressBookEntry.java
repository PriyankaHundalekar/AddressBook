
public class AddressBookEntry {

	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private int mobilenumber1;
	private int zipcode;

	public AddressBookEntry(String firstname, String lastname, String address, String city, String state,
			int mobilenumber1, int zipcode) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.mobilenumber1 = mobilenumber1;
		this.zipcode = zipcode;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return null;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getMobilenumber1() {
		return zipcode;
	}

	public void setMobilenumber1(int mobilenumber1) {
		this.mobilenumber1 = mobilenumber1;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String toString() {
		return "Firstname:" + firstname + ",lastname:" + lastname + ",address:" + address + ",city:" + city + ",state:"
				+ state + ",mobile number1:" + mobilenumber1 + ",Zip Code:" + zipcode;

	}

}
