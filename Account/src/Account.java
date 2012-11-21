import java.text.NumberFormat;

//*******************************************************************
// Account.java 
// 
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the 
// account.
//*******************************************************************

public class Account {
	
	//------------------------------------------------
	// Defines the class variables
	//------------------------------------------------
	
	private double balance;
	private String name;
	private long acctNum;
	
	//------------------------------------------------
	// Constructor -- initializes balance, owner, and account number
	//------------------------------------------------
	
	public Account(double initBal, String owner, long number) {
		
		balance = initBal;
		name = owner;
	    acctNum = number;
	    }
		
	//------------------------------------------------
	// Checks to see if the balance is sufficient for withdrawl.
	// If so, decrements balance by amount; if not, prints message.
	//------------------------------------------------
		
	public void withdraw(double amount) {
			
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient funds");
	}
	
	//------------------------------------------------
	// Adds deposit amount to balance.
	//------------------------------------------------
	
	public void deposit(double amount) {
		
		balance += amount;
	}
	
	//------------------------------------------------
	// Returns balance.
	//------------------------------------------------
	
	public double getBalance() {
		
		return balance;
	}
	
	//------------------------------------------------
	// Returns a string constraining the name, account number, and balance.
	//------------------------------------------------
	
	public String toString() {
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return name + "\t" + acctNum + "\t" + fmt.format(balance);
	}
	
	//------------------------------------------------
	// Deducts $10 service fee
	//------------------------------------------------
	
	public double chargeFee() {
		
		balance -= 10;
		return balance;
	}
	
	//------------------------------------------------
	// Changes the name on the account
	//------------------------------------------------
	
	public void changeName(String newName) {
		
		name = newName;
	}
}
