import java.util.*;
public class Week1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		char c;
		boolean isitLetter;
		
		while(true) {
			System.out.print("문자를 입력하세요:");
			
			input=sc.next();
			c = input.charAt(0);
			if(c=='0') break;
			
			isitLetter=Character.isLetter(c);
			
			if(isitLetter) {
				if(Character.isUpperCase(c)) {
					input=input.toLowerCase();
					System.out.println(input);
				}else {
					input=input.toUpperCase();
					System.out.println(input);
				}
			}
			if(isitLetter==false) {
				System.out.println("영문자가 아닙니다.");
				System.out.println(input);
			}
		}
		
		sc.close();
	}

}
