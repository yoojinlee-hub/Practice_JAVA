import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment8_2Test {

	public static void main(String[] args) {
		String day = "�Ͽ�ȭ�������";
		//InputMismatchException test = new InputMismatchException();
		Scanner sc = new Scanner(System.in);
		int n = 0,cnt=0,tmp=0;

		while(tmp==0) {
			cnt=0;
			System.out.print("������ �Է��ϼ���>>");

			try{
				n = sc.nextInt();
				cnt=1;
				
				if(n<0) {
					System.out.println("���α׷��� �����մϴ�...");
					tmp=1;
					break;
				}
				if(cnt==1)
					System.out.println(day.charAt(n));
			}catch(InputMismatchException e) {
				System.out.println("���! ���� �Է����� �ʾҽ��ϴ�");
				sc.next();
				continue;
			}
			
		}
	}

}
