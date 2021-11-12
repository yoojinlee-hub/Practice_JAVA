import java.util.*;

public class BankAccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankAccount b0 = new BankAccount();
		BankAccount b1 = new BankAccount("�ҳ�",2000);
		BankAccount b2 = new BankAccount("������",500,3.25);
		int money;
		b0.setName("��ź");
		b0.setBalance(100);
		b0.setInterest(3.5);

		b1.setInterest(2.1);

		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println();
		//ù��° ���¿� �Ա�
		System.out.print("����"+b0.getAccNo()+"�� �Ա��� �ݾ��� �Է��ϼ���:");
		money = input.nextInt();
		if(b0.deposit(money)) {
			System.out.println("�Ա��� �����߽��ϴ�.");
			b0.setBalance(b0.getBalance()+money);

		}else
			System.out.println("�Ա��� �����߽��ϴ�.");

		System.out.println();
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());

		//2��° ���¿��� ���
		System.out.println();
		System.out.print("����"+b1.getAccNo()+"�� ����� �ݾ��� �Է��ϼ���:");
		money = input.nextInt();
		if(b1.withdraw(money)) {
			System.out.println("����� �����߽��ϴ�.");
			b1.setBalance(b1.getBalance()-money);

		}else
			System.out.println("����� �����߽��ϴ�.");

		System.out.println();
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());

		//2�����¿��� 3�����·� �۱�
		System.out.println();
		System.out.print("����"+b1.getAccNo()+"���� ����"+b2.getAccNo()+"���� �۱��� �ݾ��� �Է��ϼ���:");
		money = input.nextInt();
		if(b1.transfer(b1,b2,money)) {
			System.out.println("�۱��� �����߽��ϴ�.");
			
		}else
			System.out.println("�۱��� �����߽��ϴ�.");

		System.out.println();
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());

		input.close();
	}

}
