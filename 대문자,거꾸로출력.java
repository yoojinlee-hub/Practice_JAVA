import java.util.Scanner;

public class Assignment7_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String words = new String();
		int i;
		
		System.out.print("���ڿ��� �Է��ϼ���:");
		words = input.next();

		System.out.println("�빮�ڷ� ��ȯ: "+words.toUpperCase());
		
		System.out.print("�Ųٷ� ���: ");
		i=words.length()-1;
		
		while(i>=0) {
			System.out.print(words.charAt(i--));
		}
		
		input.close();
	}

}
