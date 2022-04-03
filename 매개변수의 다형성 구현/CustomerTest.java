import java.util.ArrayList;
import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Customer> arr = new ArrayList<Customer>();
		Customer c = null;
		String grade, name;
		int price;

		System.out.println(">>���� �����?(s/v/g)");
		grade = sc.next();
		System.out.println(">>���� �̸���?");
		name = sc.next();
		System.out.println(">>������ ������?");
		price = sc.nextInt();

		switch(grade) {
		case "s":
			c = new Customer();
			c.customerName = name;
			arr.add(c);
			break;
		case "v":
			c = new VIPCustomer();
			c.customerName = name;
			arr.add(c);
			break;
		case "g":
			c = new GoldCustomer();
			c.customerName = name;
			arr.add(c);
			break;
		default:
			break;
		}
		
		System.out.printf("%s���� ���αݾ��� %d��, ���ұݾ��� %d�� �Դϴ�.\n�����Ǵ� ���ʽ� ����Ʈ�� %d���Դϴ�.",c.customerName,(int)(calcPrice(c,price)), (int)(howMuch(c,price)),(int)(c.calcBonus((int)(howMuch(c,price)))));
		sc.close();
	}
	static void showCustomerInfo(Customer c) {
		c.getCustomerInfo();
	}
	//�Ű������� ������ �̿�
	static double howMuch(Customer c, int money) {
		return c.calcPrice(money);
	}
	static double howMuchPoint(Customer c, int money) {
		return c.bonusRatio*money + c.bonusPoint;
	}
	static double calcPrice(Customer c,int price){
		double newPrice;
		newPrice = price -howMuch(c,price);
		return newPrice;
	}
}
