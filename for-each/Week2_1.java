import java.util.*;
public class Week2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numArr= new int[5];
		String[] names = new String[5];
		double sum=0;
		
		System.out.print("������ �Է��ϼ���:");
		for(int i=0;i<5;i++)
			numArr[i]=sc.nextInt();
		System.out.print("���� ");
		for(int num:numArr)
			sum+=num;
		System.out.println(sum);
		
		System.out.print("�̸��� �Է��ϼ���:");
		for(int i=0;i<5;i++)
			names[i]=sc.next();
		System.out.print("�Էµ� �̸��� ");
		for(String name:names)
			System.out.print(name+' ');
		
		sc.close();
	}

}
