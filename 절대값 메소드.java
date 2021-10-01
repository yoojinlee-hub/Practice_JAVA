import java.util.Scanner;

public class Assignment5_4 {

	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		num = input.nextInt();

		System.out.println("입력된 정수 "+ num +"의 절대값은 "+ abs(num)+"입니다.");
	}

	public static int abs(int a) {
		if(a<0)
			return -a;
		else
			return a;
	}
}
