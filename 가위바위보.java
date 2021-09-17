import java.util.*;

public class Assignment3_2 {

	public static void main(String[] args) {
		String userA;
		String userB;
		String winner="A";
		Scanner input = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("User A >> ");
		userA = input.next();
		System.out.print("User B >> ");
		userB = input.next();
		
		if(userA.equals("가위")) {
			if(userB.equals("가위"))
				winner = "무승부";
			else if(userB.equals("바위"))
				winner = "B";
			else if(userB.equals("보"))
				winner = "A";
		}
		else if(userA.equals("바위")) {
			if(userB.equals("가위"))
				winner = "A";
			else if(userB.equals("바위"))
				winner = "무승부";
			else if(userB.equals("보"))
				winner = "B";
		}
		else if(userA.equals("보")) {
			if(userB.equals("가위"))
				winner = "B";
			else if(userB.equals("바위"))
				winner = "A";
			else if(userB.equals("보"))
				winner = "무승부";
		}
		
		if(winner.equals("무승부"))
			System.out.println("서로 비겼습니다.");
		else
			System.out.println(winner+"가 이겼습니다.");
	}

}
