import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice15_4Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		Scanner input = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.print("������ �Է��Ͻÿ�(�ܾ�� ,�� �����Ͽ� �Է�):");
			str = new String(input.nextLine());
			StringTokenizer st =new StringTokenizer(str, ",");
			num=st.countTokens();

			if(str.equals("exit"))
				break;
			System.out.println();
			System.out.println("���� ������"+num);
			
			
		}
		
	}


}
