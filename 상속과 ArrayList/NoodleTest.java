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

		System.out.print("�ֹ��� ������ ����:");
		n=sc.nextInt();

		System.out.printf("[Į����(7000), �ø�(11000), �̸�(8000), ���(4000), �ұ���(10000)]���� ���� %d���� �Է�:",n);
		for(i=0;i<n;i++) {
			menu=sc.next();
			arr.add(new Noodle(menu));
		}

		for(i=0;i<n;i++)
			price+=arr.get(i).getTotalPrice();

		System.out.println("�ֹ��� ������ �� �ݾ�: "+ price);

	}

}
