import java.util.Scanner;
public class Practice_repeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		int sum=0;
		int i;
		
		System.out.print("ù��° ���ڸ� �Է��ϼ���:");
		n=sc.nextInt();
		m=n;
		while(n>=1) {
			sum+=n;
			n=n-1;
		}
		System.out.printf("1���� %d���� ���� %d�Դϴ�.",m,sum);
		sum=0;
		
		System.out.println();
		System.out.println("=======================");
		System.out.print("�ι�° ���ڸ� �Է��ϼ���:");
		m=sc.nextInt();
		for(i=1;i<=m;i++)
			sum+=i;
		System.out.printf("1���� %d���� ���� %d�Դϴ�.",m,sum);
		
		sc.close();;
	}

}
