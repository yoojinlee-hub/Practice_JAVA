import java.util.*;

public class Assignment4_5 {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();
		double max;
		double sum=0.0;
		
		list.add(1.0);
		list.add(2.0);
		list.add(3.0);
		list.add(4.0);
		
		max = list.get(0); //�ϴ� ù��°�� �ִ��� ����
		
		for(Double num: list) {
			System.out.print(num + "  ");
			sum = sum + num;
			if(max<=num)
				max=num;
		}
		
		System.out.println();
		System.out.println("���� "+ sum);
		System.out.println("�ִ밪�� "+ max);
	}

}
