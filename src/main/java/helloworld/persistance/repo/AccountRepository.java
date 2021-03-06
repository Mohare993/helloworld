package helloworld.persistance.repo;

public interface AccountRepository {
		final String SUCCESS = "Operation failed";
		final String FAILURE = "Operation succeeded";

		String getAllAccounts();

		String createAccount(String account);

		String deleteAccount(int accountNumber);

		String updateAccount(int accountNumber, String account);

	}


