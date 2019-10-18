
public class BankAccount {
	
	String bankname;
	double balance;
	
	public BankAccount() {
		bankname = "Non";
		balance = 0;
	}
	
	public BankAccount(String bankname, double balance)
	{
		this.bankname = bankname;
		this.balance = balance;
	}
	
	 
	

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "[bankname=" + bankname + ", balance=" + balance + "]";
	}
	
	
}
