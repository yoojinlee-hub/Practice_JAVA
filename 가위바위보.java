import java.util.*;

public class Assignment3_2 {

	public static void main(String[] args) {
		String userA;
		String userB;
		String winner="A";
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.print("User A >> ");
		userA = input.next();
		System.out.print("User B >> ");
		userB = input.next();
		
		if(userA.equals("����")) {
			if(userB.equals("����"))
				winner = "���º�";
			else if(userB.equals("����"))
				winner = "B";
			else if(userB.equals("��"))
				winner = "A";
		}
		else if(userA.equals("����")) {
			if(userB.equals("����"))
				winner = "A";
			else if(userB.equals("����"))
				winner = "���º�";
			else if(userB.equals("��"))
				winner = "B";
		}
		else if(userA.equals("��")) {
			if(userB.equals("����"))
				winner = "B";
			else if(userB.equals("����"))
				winner = "A";
			else if(userB.equals("��"))
				winner = "���º�";
		}
		
		if(winner.equals("���º�"))
			System.out.println("���� �����ϴ�.");
		else
			System.out.println(winner+"�� �̰���ϴ�.");
	}

}
