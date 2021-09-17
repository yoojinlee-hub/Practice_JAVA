import java.util.*;

public class Assignment3_3 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int max = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		num1 = input.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		num2 = input.nextInt();
		System.out.print("세번째 숫자를 입력하세요: ");
		num3 = input.nextInt();
		
		if(num1 >= num2) {
			if(num1 >= num3)
				max = num1;
			else
				max = num3;
		}
		else { //num1<num2
			if(num2 >= num3)
				max = num2;
			else
				max = num3;
		}
		
		System.out.println("가장 큰 숫자는 "+max+"입니다.");
	}

}
