package service;

import java.util.List;

import exceptions.AccountNotFoundException;
import helloworld.persistance.repo.Account;

public interface AccountService {
	

	String getAllAccounts();

	String createAccount(String account);

	String deleteAccount(int accountId) throws AccountNotFoundException;

	String updateAccount(int accountId, String account) throws AccountNotFoundException;

	List<Account> findAccountsByFirstName(String firstName);
}