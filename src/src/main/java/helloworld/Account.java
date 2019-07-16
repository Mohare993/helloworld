package helloworld;

public class Account {

	private int id = 0;
	private int accountNumber;
	private String firstName;
	private String lastName;
	private static int counter;

	public static int getNextId() {
		return ++counter;
	}
	
	public static int getId() {
		return counter;
	}


	public void setId(int id) {
		this.id = id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Account(int accountNumber, String firstName, String lastName) {
		super();
		this.id = getNextId();
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}

}
