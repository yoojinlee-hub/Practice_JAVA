import java.util.*;

public class DivideByZeroOK {

	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������:");
		x = sc.nextInt();
		System.out.print("����:");
		y = sc.nextInt();
		try {
			int result=x/y;
		}catch(ArithmeticException e) { //�׳� Exception e�� �ᵵ ��
			System.out.println("0���� ���� �� �����ϴ�");
		}
		System.out.println("���α׷��� ��� ����˴ϴ�");
	}

}
