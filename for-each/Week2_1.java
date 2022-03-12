import java.util.*;
public class Week2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numArr= new int[5];
		String[] names = new String[5];
		double sum=0;
		
		System.out.print("정수를 입력하세요:");
		for(int i=0;i<5;i++)
			numArr[i]=sc.nextInt();
		System.out.print("합은 ");
		for(int num:numArr)
			sum+=num;
		System.out.println(sum);
		
		System.out.print("이름을 입력하세요:");
		for(int i=0;i<5;i++)
			names[i]=sc.next();
		System.out.print("입력된 이름은 ");
		for(String name:names)
			System.out.print(name+' ');
		
		sc.close();
	}

}
