import java.util.Scanner;

public class Assignment5_4 {

	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		num = input.nextInt();

		System.out.println("�Էµ� ���� "+ num +"�� ���밪�� "+ abs(num)+"�Դϴ�.");
	}

	public static int abs(int a) {
		if(a<0)
			return -a;
		else
			return a;
	}
}
