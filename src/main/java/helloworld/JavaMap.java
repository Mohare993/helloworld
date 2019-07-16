package helloworld;

import java.util.HashMap;

import java.util.Map;



public class JavaMap {

	
	private Map<Integer, Account> accountMap = new HashMap<Integer, Account>();
	

	
	

	public String getAllAccounts() {
		
		return null;
	}

	public Account createAccount(int accountNumber, String firstName, String lastName) {
		Account account = new Account(accountNumber,firstName,lastName);
		int mapId = Account.getId();
		return this.accountMap.put(mapId, account);
	}
	

	public String deleteAccount(int accountNumber) {
		
		return null;
	}


	public String updateAccount(int accountNumber, String account) {
		
		return null;
	}

	public JavaMap() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Javamap [accountMap=" + accountMap + "]";
	}
	
	
	
	
	
}


	

	
	

