import java.util.*;
public class ReservationTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Seats[] list;
		list = new Seats[10];
		int num;
		
		//��ü�迭 ����
		for(int i=0;i<10;i++)
			list[i] = new Seats();
		
		print(list);
		
		System.out.print("���° �¼��� �����ϰڽ��ϱ�?");
		num = input.nextInt();
		if(list[num].getSeats()==0) {
			list[num].setSeats();
			System.out.println("����Ǿ����ϴ�");
		}else
			System.out.println("����Ұ����մϴ�");
		
		print(list);

	}

	static void print(Seats[] list) { //static�� �־�� ȣ�Ⱑ��
		System.out.println("-------------------------");
		for(int i=0;i<10;i++)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("-------------------------");
		for(int i=0;i<10;i++)
			System.out.print(list[i].getSeats() + " ");
		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
	}
}
