import java.util.*;

public class Assignment2_1 {

	public static void main(String[] args) {
		int inputOrange;
		int box;
		int remain;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�������� ������ �Է��Ͻÿ�: ");
		
		inputOrange=input.nextInt();
		box=inputOrange/10;
		remain=inputOrange%10;
		
		input.close();
		
		System.out.println(box+"�ڽ��� �ʿ��ϰ� "+ remain+ "���� �����ϴ�.");
	}

}
