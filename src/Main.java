import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PersonAccount pa = new PersonAccount(1203, null, 1000, 20);
		pa.withdraw(500);
		System.out.println("tài khoản còn số dư là: "+pa.balance);
		SavingAccount sa = new SavingAccount();
		sa.setBalance(5000000);
		sa.checkInterest(5);
		
	}

}
