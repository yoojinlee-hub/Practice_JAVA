import java.util.Scanner;
public class Practice_array {
	// 선언과 동시에 초기화하면 new 코드 생략가능
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[5];
		int i;
		
		System.out.print("숫자 5개를 띄어쓰기로 구분하여 입력하세요:")	;
		for(i=0;i<5;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("==================");
		for(i=4;i>=0;i--)
			System.out.printf("%d\n",arr[i]);
		
		sc.close();
	}

}
