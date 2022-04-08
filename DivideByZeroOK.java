import java.util.*;

public class DivideByZeroOK {

	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피젯수:");
		x = sc.nextInt();
		System.out.print("젯수:");
		y = sc.nextInt();
		try {
			int result=x/y;
		}catch(ArithmeticException e) { //그냥 Exception e만 써도 됨
			System.out.println("0으로 나눌 수 없습니다");
		}
		System.out.println("프로그램은 계속 진행됩니다");
	}

}
