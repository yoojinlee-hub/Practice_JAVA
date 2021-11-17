import java.util.*;
public class MaxTest {
	static int max;
	static int sum=0;
	public static void main(String[] args) { 
		ArrayList <Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);

		System.out.println("수를 입력하시오");
		for(int i=0;i<5;i++)
			list.add(input.nextInt());

		max=list.get(0);
		for(int i=0;i<5;i++)
			findMax(list.get(i));

		System.out.println("최대값은"+max);
		System.out.println("합은"+sum);

		input.close();
	}

	//findMax()메소드를 이용해야 
	static int findMax(int num) {
		if(num>max)
			max=num;
		sum+=num;
		return max;
	}

}
