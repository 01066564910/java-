
public class Homework {
	String accountNo;
	String master;
	int balance;
	public Homework(String accountNo, String master, int balance) {
		super();
		this.accountNo = accountNo;
		this.master = master;
		this.balance = balance;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getMaster() {
		return master;
	}
	public void setMaster(String master) {
		this.master = master;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}