import java.util.*;
public class Week2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		
		System.out.println("문자열을 입력하시오:");
		s = sc.next();
		
		for(int i=s.length()-1;i>=0;i--)
			System.out.print(s.charAt(i));
	}

}
