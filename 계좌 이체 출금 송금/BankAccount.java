
public class BankAccount {
	private String name;
	private String accNo;
	private int balance;
	private double interest;
	
	
	String getName() {return name;}
	String getAccNo() { return accNo;}
	int getBalance() { return balance;}
	double getInterest() {return interest;}
	
	
	void setName(String name) { this.name=name; }
	void setAccNo(String accNo) {this.accNo=accNo;}
	void setBalance(int balance) {this.balance=balance;}
	void setInterest(double interest) {this.interest=interest;}
	
	
	BankAccount(){
		setAccNo((int)((Math.random()*9000)+1000)+"-"+(int)((Math.random()*9000)+1000));
	}
	BankAccount(String name,int balance){
		setName(name);
		setBalance(balance);
		setAccNo((int)((Math.random()*9000)+1000)+"-"+(int)((Math.random()*9000)+1000));
	}
	BankAccount(String name, int balance, double interest){
		setName(name);
		setBalance(balance);
		setInterest(interest);
		setAccNo((int)((Math.random()*9000)+1000)+"-"+(int)((Math.random()*9000)+1000));
	}
	
	
	
	public boolean deposit(int money) {
		if(money<0)
			return false;
		else
			return true;
	}
	public boolean withdraw(int money) {
		if(money>this.balance)
			return false;
		else 
			return true;
	}
	public static boolean transfer(BankAccount from,BankAccount to,int money) {
		if(from.withdraw(money)) {
			to.balance -= money;
			from.balance += money;
			return true;
		}
		else
			return false;
	}
	public String toString() {
		return accNo + " :: "+name+" :: "+balance+"¿ø :: "+interest+"%";
	}
}
