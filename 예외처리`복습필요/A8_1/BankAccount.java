
public class BankAccount extends Exception{
	int balance;

	public BankAccount() {
		balance=0;
	}
	
	public void deposit(int money) throws NegativeBalanceException{
		if(money<0)
			throw new NegativeBalanceException("음수 입금액");
		else
			balance+=money;
		
	}
	public void withdraw(int money) throws NegativeBalanceException{
		if(balance<money)
			throw new NegativeBalanceException("잔고 부족");
		else if(money<0)
			throw new NegativeBalanceException("잘못된 금액");
		else
			balance-=money;
	}
}
