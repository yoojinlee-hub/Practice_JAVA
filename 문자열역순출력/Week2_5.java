import java.util.*;
public class Week2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		
		System.out.println("���ڿ��� �Է��Ͻÿ�:");
		s = sc.next();
		
		for(int i=s.length()-1;i>=0;i--)
			System.out.print(s.charAt(i));
	}

}
