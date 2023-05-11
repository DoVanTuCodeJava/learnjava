
public class Account {
	protected int accountNo;
	protected String customerName;
	protected float balance;
	
	public Account() {}
	
	public Account(int accountNo ,String customerName ,float balance) {
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.balance = balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	

	
}
