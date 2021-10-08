import java.util.*;

public class Assignment2_1 {

	public static void main(String[] args) {
		int inputOrange;
		int box;
		int remain;
		Scanner input = new Scanner(System.in);
		
		System.out.print("오랜지의 개수를 입력하시오: ");
		
		inputOrange=input.nextInt();
		box=inputOrange/10;
		remain=inputOrange%10;
		
		input.close();
		
		System.out.println(box+"박스가 필요하고 "+ remain+ "개가 남습니다.");
	}

}
