import java.util.*;
public class Assignment9_2Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		String input;
		int i;
		
		while(true) {
			System.out.println("�� �ٷ� ������ �Է��Ͻÿ�(����� exit�� �Է�)>>");
			input = sc.nextLine();
			st = new StringTokenizer(input," ");
			
			if(input.equals("exit")) {
				System.out.println("�����մϴ�...");
				break;
			}
				
			System.out.println("������ ������"+st.countTokens());
			System.out.printf("������ ������ %d\n",st.countTokens()-1);
		}

	}

}
