package helloworld.persistance.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.enterprise.inject.Alternative;

import exceptions.AccountNotFoundException;
import util.JSONUtil;


@Alternative
public class AccountMapRepository implements AccountRepository {

	private Map<Integer, Account> accountMap;

	private int count = 1;

	private JSONUtil json;

	public AccountMapRepository() {
		super();
		this.accountMap = new HashMap<Integer, Account>();
		this.json = new JSONUtil();
	}

	@Override
	public String getAllAccounts() {
		return this.json.getJSONForObject(this.accountMap.values());
	}

	@Override
	public String createAccount(String account) {
		Account toAdd = this.json.getObjectForJSON(account, Account.class);
		this.accountMap.put(this.count++, toAdd);
		if (this.accountMap.containsValue(toAdd)) {
			return SUCCESS;
		} else {
			return FAILURE;
		}
	}

	@Override
	public String deleteAccount(int accountNumber) throws AccountNotFoundException {
		if (!this.accountMap.containsKey(accountNumber)) {
			throw new AccountNotFoundException();
		} else {
			this.accountMap.remove(accountNumber);
			return SUCCESS;
		}
	}

	@Override
	public String updateAccount(int accountNumber, String account) throws AccountNotFoundException {
		Account toUpdate = this.json.getObjectForJSON(account, Account.class);
		this.accountMap.replace(accountNumber, toUpdate);
		if (this.accountMap.containsValue(toUpdate)) {
			return SUCCESS;
		} else {
			return FAILURE;
		}
	}

	@Override
	public List<Account> findAccountsByFirstName(String firstName) {
		return this.accountMap.values().stream().filter(a -> a.getFirstName().equals(firstName))
				.collect(Collectors.toList());
	}

}
	

	
	

