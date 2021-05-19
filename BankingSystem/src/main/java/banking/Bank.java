package banking;

import java.util.LinkedHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts;
	private long counter;

	public Bank() {
		// complete the function
		this.accounts = new LinkedHashMap<>();
		this.counter = 1;
	}

	private Account getAccount(Long accountNumber) {
		// complete the function
        return this.accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		long accountNumber = this.counter;
		CommercialAccount commercialAccount = new CommercialAccount(company, accountNumber, pin, startingDeposit);
		this.accounts.put(accountNumber, commercialAccount);
		this.counter++;
        return accountNumber;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		long accountNumber = this.counter;
		ConsumerAccount consumerAccount = new ConsumerAccount(person, accountNumber, pin, startingDeposit);
		this.accounts.put(accountNumber, consumerAccount);
		this.counter++;
		return accountNumber;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
        return getAccount(accountNumber).validatePin(pin);
	}

	public double getBalance(Long accountNumber) {
		// complete the function
        return getAccount(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		getAccount(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
        return getAccount(accountNumber).debitAccount(amount);
	}

	public AccountHolder getAccountHolder(Long accountNumber) {
		return getAccount(accountNumber).getAccountHolder();
	}

}
