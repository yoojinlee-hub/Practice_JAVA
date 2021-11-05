
public class Account {
	private int accountNumber;
	private String owner;
	private int balance;
	
	public int deposit(int money) { //예금
		balance += money;
		return balance;
	}
	public int withdraw(int money) { //출금
		balance -= money;
		return balance;
	}
	public String toString() {
		return "현재 잔액은 "+balance+"입니다.";
	}
	void transfer(int amount,Account other) {
		other.balance +=amount;
		this.balance -= amount; //현재객체
	}
}
