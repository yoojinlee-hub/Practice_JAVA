import java.util.*;

public class Assignment3_3 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int max = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է��ϼ���: ");
		num1 = input.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���: ");
		num2 = input.nextInt();
		System.out.print("����° ���ڸ� �Է��ϼ���: ");
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
		
		System.out.println("���� ū ���ڴ� "+max+"�Դϴ�.");
	}

}
