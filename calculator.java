import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b;

		System.out.print("ù��° ���ڸ� �Է��ϼ���:");
		a=input.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���:");
		b=input.nextInt();
		System.out.println("===��Ģ���� ����ϱ�===");
		System.out.printf("%d+%d=%d\n",a,b,a+b);
		System.out.printf("%d-%d=%d\n",a,b,a-b);
		System.out.printf("%d*%d=%d\n",a,b,a*b);
		System.out.printf("%d/%d=%d\n",a,b,a/b);
		System.out.printf("%d%%%d=%d\n",a,b,a%b);
	}

}
