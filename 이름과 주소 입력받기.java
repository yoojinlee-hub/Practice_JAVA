import java.util.Scanner;

public class Assignment5_6 {

	public static void main(String[] args) {
		String name;
		String juso;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���:  ");
		name = input.next();
		
		input.nextLine(); //���۹���� �ٸ� �Ͱ� ���Ǵ� �κп� ���ش�!
		
		System.out.print("�ּҸ� �Է��ϼ���:  ");
		juso = input.nextLine();
		
		address(name,juso);

	}
	
	public static void address(String n, String add) {
		System.out.println(n + "�� �ּҴ� "+ add +"�Դϴ�.");
	}

}
