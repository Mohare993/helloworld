package service;

import java.util.List;

import javax.inject.Inject;

import exceptions.AccountNotFoundException;
import helloworld.persistance.repo.Account;
import helloworld.persistance.repo.AccountRepository;

public class AccountServiceImpl implements AccountService {

	@Inject
	private AccountRepository repo;

	@Override
	public String getAllAccounts() {
		return this.repo.getAllAccounts();
	}

	@Override
	public String createAccount(String account) {
		return this.repo.createAccount(account);
	}

	@Override
	public String deleteAccount(int accountId) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateAccount(int accountId, String account) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> findAccountsByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}



}


