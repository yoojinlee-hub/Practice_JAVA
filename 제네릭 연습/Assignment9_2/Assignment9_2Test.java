import java.util.*;
public class Assignment9_2Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		String input;
		int i;
		
		while(true) {
			System.out.println("한 줄로 문장을 입력하시오(종료는 exit를 입력)>>");
			input = sc.nextLine();
			st = new StringTokenizer(input," ");
			
			if(input.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
				
			System.out.println("어절의 개수는"+st.countTokens());
			System.out.printf("공백의 개수는 %d\n",st.countTokens()-1);
		}

	}

}
