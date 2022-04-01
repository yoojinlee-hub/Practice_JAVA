import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Customer c1 = new Customer(10010,"�̼���");
		Customer c2 = new VIPCustomer(10020,"������",1);
		int price;
		
		c1.bonusPoint=1000;
		c2.bonusPoint=10000;
		
		showCustomerInfo(c1);
		showCustomerInfo(c2);
		
		System.out.print("������ ����:");
		price = sc.nextInt();
		
		System.out.print(c1.getCustomerName()+"�� �� ����:");
		System.out.println(howMuch(c1,price));
		System.out.print(c2.getCustomerName()+"�� �� ����:");
		System.out.println(howMuch(c2,price));
		
		System.out.print(c1.getCustomerName()+"�� ����Ʈ:");
		System.out.println(howMuchPoint(c1,price));
		System.out.print(c1.getCustomerName()+"�� ����Ʈ:");
		System.out.println(howMuchPoint(c2,price));
		sc.close();
	}
	static void showCustomerInfo(Customer c) {
		System.out.println("Customer() ������ ȣ��");
		c.getCustomerInfo();
	}
	//�Ű������� ������ �̿�
	static double howMuch(Customer c, int money) {
		return c.calcPrice(money);
	}
	static double howMuchPoint(Customer c, int money) {
		return c.bonusRatio*money + c.bonusPoint;
	}
}
