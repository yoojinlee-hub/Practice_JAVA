import java.util.*;

public class Assignment3_4 {

	public static void main(String[] args) {
		int num;
		int sum = 0;
		int i = 0;
		int cnt = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���Ϸ��� ������ ���ڸ� �Է��ϼ���: ");
		num = input.nextInt();
		
		while(i<=num) {
			cnt++;
			
			if(cnt%5==0)
				System.out.print("\t"+i+"\n");
			else if(cnt%5==1)
				System.out.print(i);
			else
				System.out.print("\t"+i);
			
			sum = sum + i;
			i = i + 3;
		}
		
		System.out.println("\n0���� "+num+"������ 3�� ��� ��: "+ sum);
	}

}
