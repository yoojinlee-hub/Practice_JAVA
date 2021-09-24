import java.util.*;

public class Assignment4_6 {

	public static void main(String[] args) {
		int[] scores;
		int studentNum;
		int count = 0;
		int sum = 0;
		double average;
		Scanner input = new Scanner(System.in);
		
		System.out.print("성적을 입력받는 학생의 수는?");
		studentNum = input.nextInt();
		
		scores = new int[studentNum];
		
		while(count<scores.length) {
			System.out.print((count+1)+"번째 학생의 성적을 입력하세요:");
			scores[count] = input.nextInt();
			
			sum = sum + scores[count];
			count++;
		}
		average = (double)sum/scores.length;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
	}

}
