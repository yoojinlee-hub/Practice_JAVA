import java.util.*;

public class Assignment4_6 {

	public static void main(String[] args) {
		int[] scores;
		int studentNum;
		int count = 0;
		int sum = 0;
		double average;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է¹޴� �л��� ����?");
		studentNum = input.nextInt();
		
		scores = new int[studentNum];
		
		while(count<scores.length) {
			System.out.print((count+1)+"��° �л��� ������ �Է��ϼ���:");
			scores[count] = input.nextInt();
			
			sum = sum + scores[count];
			count++;
		}
		average = (double)sum/scores.length;
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + average);
	}

}
