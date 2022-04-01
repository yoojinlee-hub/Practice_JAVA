import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Customer c1 = new Customer(10010,"이순신");
		Customer c2 = new VIPCustomer(10020,"김유신",1);
		int price;
		
		c1.bonusPoint=1000;
		c2.bonusPoint=10000;
		
		showCustomerInfo(c1);
		showCustomerInfo(c2);
		
		System.out.print("물건의 가격:");
		price = sc.nextInt();
		
		System.out.print(c1.getCustomerName()+"이 낼 가격:");
		System.out.println(howMuch(c1,price));
		System.out.print(c2.getCustomerName()+"이 낼 가격:");
		System.out.println(howMuch(c2,price));
		
		System.out.print(c1.getCustomerName()+"의 포인트:");
		System.out.println(howMuchPoint(c1,price));
		System.out.print(c1.getCustomerName()+"의 포인트:");
		System.out.println(howMuchPoint(c2,price));
		sc.close();
	}
	static void showCustomerInfo(Customer c) {
		System.out.println("Customer() 생성자 호출");
		c.getCustomerInfo();
	}
	//매개변수의 다형성 이용
	static double howMuch(Customer c, int money) {
		return c.calcPrice(money);
	}
	static double howMuchPoint(Customer c, int money) {
		return c.bonusRatio*money + c.bonusPoint;
	}
}
