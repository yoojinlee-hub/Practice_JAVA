import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b;

		System.out.print("첫번째 숫자를 입력하세요:");
		a=input.nextInt();
		System.out.print("두번째 숫자를 입력하세요:");
		b=input.nextInt();
		System.out.println("===사칙연산 출력하기===");
		System.out.printf("%d+%d=%d\n",a,b,a+b);
		System.out.printf("%d-%d=%d\n",a,b,a-b);
		System.out.printf("%d*%d=%d\n",a,b,a*b);
		System.out.printf("%d/%d=%d\n",a,b,a/b);
		System.out.printf("%d%%%d=%d\n",a,b,a%b);
	}

}
