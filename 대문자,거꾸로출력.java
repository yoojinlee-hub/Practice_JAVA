import java.util.Scanner;

public class Assignment7_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String words = new String();
		int i;
		
		System.out.print("문자열을 입력하세요:");
		words = input.next();

		System.out.println("대문자로 변환: "+words.toUpperCase());
		
		System.out.print("거꾸로 출력: ");
		i=words.length()-1;
		
		while(i>=0) {
			System.out.print(words.charAt(i--));
		}
		
		input.close();
	}

}
