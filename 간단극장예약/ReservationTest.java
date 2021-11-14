import java.util.*;
public class ReservationTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Seats[] list;
		list = new Seats[10];
		int num;
		
		//객체배열 생성
		for(int i=0;i<10;i++)
			list[i] = new Seats();
		
		print(list);
		
		System.out.print("몇번째 좌석을 예약하겠습니까?");
		num = input.nextInt();
		if(list[num].getSeats()==0) {
			list[num].setSeats();
			System.out.println("예약되었습니다");
		}else
			System.out.println("예약불가능합니다");
		
		print(list);

	}

	static void print(Seats[] list) { //static이 있어야 호출가능
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
