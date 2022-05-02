import java.util.Scanner;

public class Assignment9_5Test{

	public static void main(String[] args) {
		int num1;
		float num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요>>");
		num1=sc.nextInt();
		
		System.out.print("실수를 입력하세요>>");
		num2 = sc.nextFloat();
		
		System.out.print(num1+"의 클래스 이름:");
		a(num1);
		System.out.print(num2+"의 클래스 이름:");
		a(num2);

	}
	static <T> void a(T t) {
		System.out.print(t.getClass().getName()+"\n");
	}
}
