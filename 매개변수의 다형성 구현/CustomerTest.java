import java.util.ArrayList;
import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Customer> arr = new ArrayList<Customer>();
		Customer c = null;
		String grade, name;
		int price;

		System.out.println(">>고객의 등급은?(s/v/g)");
		grade = sc.next();
		System.out.println(">>고객의 이름은?");
		name = sc.next();
		System.out.println(">>물건의 가격은?");
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
		
		System.out.printf("%s님의 할인금액은 %d원, 지불금액은 %d원 입니다.\n적립되는 보너스 포인트는 %d원입니다.",c.customerName,(int)(calcPrice(c,price)), (int)(howMuch(c,price)),(int)(c.calcBonus((int)(howMuch(c,price)))));
		sc.close();
	}
	static void showCustomerInfo(Customer c) {
		c.getCustomerInfo();
	}
	//매개변수의 다형성 이용
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
