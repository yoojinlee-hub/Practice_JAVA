import java.util.Scanner;

public class Assignment9_5Test{

	public static void main(String[] args) {
		int num1;
		float num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���>>");
		num1=sc.nextInt();
		
		System.out.print("�Ǽ��� �Է��ϼ���>>");
		num2 = sc.nextFloat();
		
		System.out.print(num1+"�� Ŭ���� �̸�:");
		a(num1);
		System.out.print(num2+"�� Ŭ���� �̸�:");
		a(num2);

	}
	static <T> void a(T t) {
		System.out.print(t.getClass().getName()+"\n");
	}
}
