
public class Account {
	private int accountNumber;
	private String owner;
	private int balance;
	
	public int deposit(int money) { //����
		balance += money;
		return balance;
	}
	public int withdraw(int money) { //���
		balance -= money;
		return balance;
	}
	public String toString() {
		return "���� �ܾ��� "+balance+"�Դϴ�.";
	}
	void transfer(int amount,Account other) {
		other.balance +=amount;
		this.balance -= amount; //���簴ü
	}
}
