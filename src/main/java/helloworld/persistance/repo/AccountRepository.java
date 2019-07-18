package helloworld.persistance.repo;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;
import helloworld.persistance.repo.Account;


public interface AccountRepository {
	
	final String SUCCESS = "Operation succeeded";
	final String FAILURE = "Operation failed";

	String getAllAccounts();

	String createAccount(String account);

	String deleteAccount(int accountId) throws AccountNotFoundException;

	String updateAccount(int accountId, String account) throws AccountNotFoundException;

	List<Account> findAccountsByFirstName(String firstName);

}
