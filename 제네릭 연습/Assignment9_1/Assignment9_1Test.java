import java.util.*;

public class Assignment9_1Test {

	public static void main(String[] args) {
		String input;
		String[] arr;
		int i=0;
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		
		System.out.print("�ܾ� ���ڿ��� �Է��ϼ���>>");
		input = sc.nextLine();
		st = new StringTokenizer(input," ");
		arr = new String[st.countTokens()];
		
		while(st.hasMoreTokens()) {
			arr[i++] = st.nextToken();
		}
		
		System.out.printf("���%d���� �ܾ �ֽ��ϴ�\n",i);
		System.out.println("[�и��� ��ū]");
		
		for(int j=0;j<i;j++)
			System.out.println(arr[j]);
		System.out.printf("��ū�� : %d\n", i);
		
		System.out.println("======= sort ==========");
		Arrays.sort(arr);
		for(int j=0;j<i;j++)
			System.out.println(arr[j]);
		
	}

}
