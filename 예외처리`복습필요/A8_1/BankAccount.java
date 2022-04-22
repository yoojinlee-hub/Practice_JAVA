
public class BankAccount extends Exception{
	int balance;

	public BankAccount() {
		balance=0;
	}
	
	public void deposit(int money) throws NegativeBalanceException{
		if(money<0)
			throw new NegativeBalanceException("���� �Աݾ�");
		else
			balance+=money;
		
	}
	public void withdraw(int money) throws NegativeBalanceException{
		if(balance<money)
			throw new NegativeBalanceException("�ܰ� ����");
		else if(money<0)
			throw new NegativeBalanceException("�߸��� �ݾ�");
		else
			balance-=money;
	}
}
