import java.util.*;
public class Practice15_2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st ;
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("문자열을 입력하시오:");
		st = new StringTokenizer(input.nextLine());
		num=st.countTokens();
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken()+",");
		}
		System.out.println();
		System.out.println("모두 "+ num + "개의 단어가 있습니다.");
	}

}
