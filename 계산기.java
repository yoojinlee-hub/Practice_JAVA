import java.util.*;

public class Assignment3_1 {

	public static void main(String[] args) {
		double num1;
		double num2;
		double result=0;
		int possible=0;
		String str;
		
		Scanner input = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ���:");
		str = input.next();
		System.out.print("���� 2���� �Է��ϼ���(ex:3 23):");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		
		if(str.equals("+")) 
			result = num1 + num2 ;
		else if(str.equals("-"))
			result = num1 - num2 ;
		else if(str.equals("*"))
			result = num1 * num2;
		else if(str.equals("/")) {
			if(num2 == 0)
				possible = -1;
			else
				result = num1 / num2 ;
		}
		
		if(possible==-1)
			System.out.println("������  ������ �� ����.");
		else
			System.out.println(num1 + str + num2 + " = " + result);
	}

}
