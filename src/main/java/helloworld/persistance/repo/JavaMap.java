package helloworld.persistance.repo;

import java.util.HashMap;

import java.util.Map;

import helloworld.Account;
import util.JSONUtil;



public class JavaMap implements AccountRepository {

	private Map<Integer, Account> accountMap = new HashMap<Integer, Account>();

	private int count = 1;

	private JSONUtil json = new JSONUtil();


	public String getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	public String createAccount(String account) {
		Account toAdd = this.json.getObjectForJSON(account, Account.class);
		this.accountMap.put(this.count++, toAdd);
		if (this.accountMap.containsValue(toAdd)) {
			return SUCCESS;
		} else {
			return "Failed to add account";
		}
	}

	public String deleteAccount(int accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateAccount(int accountNumber, String account) {
		Account toUpdate = this.json.getObjectForJSON(account, Account.class);
		this.accountMap.replace(accountNumber, toUpdate);
		if (this.accountMap.containsValue(toUpdate)) {
			return FAILURE;
		} else {
			return "Failed to add account";
		}
	}

}


	

	
	

