import java.util.*;

public class Assignment9_1Test {

	public static void main(String[] args) {
		String input;
		String[] arr;
		int i=0;
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		
		System.out.print("단어 문자열을 입력하세요>>");
		input = sc.nextLine();
		st = new StringTokenizer(input," ");
		arr = new String[st.countTokens()];
		
		while(st.hasMoreTokens()) {
			arr[i++] = st.nextToken();
		}
		
		System.out.printf("모두%d개의 단어가 있습니다\n",i);
		System.out.println("[분리된 토큰]");
		
		for(int j=0;j<i;j++)
			System.out.println(arr[j]);
		System.out.printf("토큰수 : %d\n", i);
		
		System.out.println("======= sort ==========");
		Arrays.sort(arr);
		for(int j=0;j<i;j++)
			System.out.println(arr[j]);
		
	}

}
