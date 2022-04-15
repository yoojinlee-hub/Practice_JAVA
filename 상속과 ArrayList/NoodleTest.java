import java.util.*;
public class NoodleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu;
		Noodle noodle = null;
		int price=0;
		ArrayList<Noodle> arr = new ArrayList<>();
		int n;
		int i=0,j;

		System.out.print("주문할 음식의 수는:");
		n=sc.nextInt();

		System.out.printf("[칼국수(7000), 냉면(11000), 쫄면(8000), 라면(4000), 쌀국수(10000)]에서 음식 %d개를 입력:",n);
		for(i=0;i<n;i++) {
			menu=sc.next();
			arr.add(new Noodle(menu));
		}

		for(i=0;i<n;i++)
			price+=arr.get(i).getTotalPrice();

		System.out.println("주문한 음식의 총 금액: "+ price);

	}

}
