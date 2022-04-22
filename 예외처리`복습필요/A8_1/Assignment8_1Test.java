
public class Assignment8_1Test {

	public static void main(String[] args) {
		int money=100;
		BankAccount b= new BankAccount();
		
		try {
			b.deposit(money);
		} catch (NegativeBalanceException e2) {
			e2.printStackTrace();
		}
		
		System.out.println("정상입금처리=> 입금액:"+money+", 잔액:"+b.balance);
		
		
		try {
			b.withdraw(money);
		} catch (NegativeBalanceException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("정상출금처리=> 출금액:"+money+", 잔액:"+b.balance);
		
		try {
			b.withdraw(100);
		}catch(NegativeBalanceException e) {
			e.printStackTrace();
		}
	}
}
