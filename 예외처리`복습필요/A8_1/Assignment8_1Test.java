
public class Assignment8_1Test {

	public static void main(String[] args) {
		int money=100;
		BankAccount b= new BankAccount();
		
		try {
			b.deposit(money);
		} catch (NegativeBalanceException e2) {
			e2.printStackTrace();
		}
		
		System.out.println("�����Ա�ó��=> �Աݾ�:"+money+", �ܾ�:"+b.balance);
		
		
		try {
			b.withdraw(money);
		} catch (NegativeBalanceException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("�������ó��=> ��ݾ�:"+money+", �ܾ�:"+b.balance);
		
		try {
			b.withdraw(100);
		}catch(NegativeBalanceException e) {
			e.printStackTrace();
		}
	}
}
