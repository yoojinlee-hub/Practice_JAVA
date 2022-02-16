import java.util.Scanner;
public class ChoiceBigNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("숫자 2개를 입력하세요: ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		
		if(a==b)
			System.out.println("같음");
		else 
			System.out.println(a>b?a:b);
	}

}
