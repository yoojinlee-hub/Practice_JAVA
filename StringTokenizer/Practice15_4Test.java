import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice15_4Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		Scanner input = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.print("문장을 입력하시오(단어는 ,로 구분하여 입력):");
			str = new String(input.nextLine());
			StringTokenizer st =new StringTokenizer(str, ",");
			num=st.countTokens();

			if(str.equals("exit"))
				break;
			System.out.println();
			System.out.println("어절 개수는"+num);
			
			
		}
		
	}


}
