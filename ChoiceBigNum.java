import java.util.Scanner;
public class ChoiceBigNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("���� 2���� �Է��ϼ���: ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		
		if(a==b)
			System.out.println("����");
		else 
			System.out.println(a>b?a:b);
	}

}
