import java.util.Scanner;
public class Practice_array {
	// ����� ���ÿ� �ʱ�ȭ�ϸ� new �ڵ� ��������
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[5];
		int i;
		
		System.out.print("���� 5���� ����� �����Ͽ� �Է��ϼ���:")	;
		for(i=0;i<5;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("==================");
		for(i=4;i>=0;i--)
			System.out.printf("%d\n",arr[i]);
		
		sc.close();
	}

}
