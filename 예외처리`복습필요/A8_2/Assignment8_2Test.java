import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment8_2Test {

	public static void main(String[] args) {
		String day = "일월화수목금토";
		//InputMismatchException test = new InputMismatchException();
		Scanner sc = new Scanner(System.in);
		int n = 0,cnt=0,tmp=0;

		while(tmp==0) {
			cnt=0;
			System.out.print("정수를 입력하세요>>");

			try{
				n = sc.nextInt();
				cnt=1;
				
				if(n<0) {
					System.out.println("프로그램을 종료합니다...");
					tmp=1;
					break;
				}
				if(cnt==1)
					System.out.println(day.charAt(n));
			}catch(InputMismatchException e) {
				System.out.println("경고! 수를 입력하지 않았습니다");
				sc.next();
				continue;
			}
			
		}
	}

}
