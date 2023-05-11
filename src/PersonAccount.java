
public class PersonAccount extends Account {
	protected float fee;
	
	public PersonAccount () {}

	public PersonAccount(int accountNo, String customerName, float balance, float fee) {
		super(accountNo, customerName, balance);
		this.fee = fee;

	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	public void withdraw(double amount1) {
		// kiem tra so du
		if (balance >= amount1) {
			balance -= amount1;
			System.out.println("Rút tiền thành công. Số dư còn lại là:" + balance);
		} else {
			System.out.println("Không đủ tiền để rút.");
		}
	}

	public void deposite(double amount2) {
		balance += amount2;
		System.out.println("Chuyển tiền thành công:" + balance);
	}

	@Override
	public String toString() {
		return "PersonAccount [fee=" + fee + ", accountNo=" + accountNo + ", customerName=" + customerName
				+ ", balance=" + balance + "]";
	}
	
	
}
