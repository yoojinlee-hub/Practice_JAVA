import java.util.Scanner;

public class Assignment5_3 {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		num1 = input.nextInt();
		System.out.print("������ �Է��ϼ���: ");
		num2 = input.nextInt();
		
		sum(num1,num2);

	}

	public static void sum(int a, int b) {
		System.out.println(a + " + "+ b +" = "+ (a+b));
	}
}
