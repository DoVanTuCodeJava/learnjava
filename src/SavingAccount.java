
public class SavingAccount extends PersonAccount {
	protected float rate;
	protected int period;
	
	public SavingAccount() {}


	public SavingAccount(int accountNo, String customerName, float balance, float fee, float rate, int period) {
		super(accountNo, customerName, balance, fee);
		this.rate = rate;
		this.period = period;
	
	}
	

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public double getRate(double rate) {
		double interest = balance * rate / 100;
		balance += interest;
		return interest;
	}
	public void checkInterest(int period) {
		if(period >= 1 && period <= 2) {
			double money = (balance * 0.05)*0.12;
			System.out.println("lãi của bạn là"+money);
		}else if(period >= 3 && period <= 5) {
			double money = (balance * 0.055)*0.12;
			System.out.println("lãi của bạn là"+money);
		}else if(period >= 6 && period <= 11) {
			double money = (balance * 0.06)*0.12;
			System.out.println("lãi của bạn là"+money);
		}else if(period >= 12 && period <= 23) {
			double money = (balance * 0.07)*0.12;
			System.out.println("lãi của bạn là"+money);
		}else if(period >= 24 && period <= 35) {
			double money = (balance * 0.075)*0.12;
			System.out.println("lãi của bạn là"+money);
		}else {
			double money = (balance * 0.08)*0.12;
			System.out.println("lãi của bạn là"+money);
		}
		
	}


	@Override
	public String toString() {
		return "SavingAccount [rate=" + rate + ", period=" + period + "]";
	}

	

}
