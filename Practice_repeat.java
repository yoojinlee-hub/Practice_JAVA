import java.util.Scanner;
public class Practice_repeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		int sum=0;
		int i;
		
		System.out.print("첫번째 숫자를 입력하세요:");
		n=sc.nextInt();
		m=n;
		while(n>=1) {
			sum+=n;
			n=n-1;
		}
		System.out.printf("1부터 %d까지 합은 %d입니다.",m,sum);
		sum=0;
		
		System.out.println();
		System.out.println("=======================");
		System.out.print("두번째 숫자를 입력하세요:");
		m=sc.nextInt();
		for(i=1;i<=m;i++)
			sum+=i;
		System.out.printf("1부터 %d까지 합은 %d입니다.",m,sum);
		
		sc.close();;
	}

}
