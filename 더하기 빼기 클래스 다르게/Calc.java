import java.util.*;
public class Calc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		String cal;
		
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
		num1 = input.nextInt();
		num2 = input.nextInt();
		cal = input.next();
		
		if(cal.equals("+")) {
			Add add = new Add();
			add.setValue(num1, num2);
			System.out.println(add.calculate());
		}
		else if(cal.equals("-")) {
			Sub sub = new Sub();
			sub.setValue(num1, num2);
			System.out.println(sub.calculate());
		}
		else
			System.out.println("�߸��� �������Դϴ�.");
	}
}
