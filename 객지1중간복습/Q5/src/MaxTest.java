import java.util.*;
public class MaxTest {
	static int max;
	static int sum=0;
	public static void main(String[] args) { 
		ArrayList <Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);

		System.out.println("���� �Է��Ͻÿ�");
		for(int i=0;i<5;i++)
			list.add(input.nextInt());

		max=list.get(0);
		for(int i=0;i<5;i++)
			findMax(list.get(i));

		System.out.println("�ִ밪��"+max);
		System.out.println("����"+sum);

		input.close();
	}

	//findMax()�޼ҵ带 �̿��ؾ� 
	static int findMax(int num) {
		if(num>max)
			max=num;
		sum+=num;
		return max;
	}

}
