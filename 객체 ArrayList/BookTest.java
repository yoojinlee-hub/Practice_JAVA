import java.util.*;
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> b = new ArrayList<>();
		String findName, name, writer;
		int i=0,num,cnt=0;
		
		System.out.print("å�� �Ǽ�>>");
		num=sc.nextInt();
		
		sc.nextLine();
		while(i<num) {
			System.out.printf("����>>");
			name=sc.nextLine();
			System.out.printf("����>>");
			writer=sc.nextLine();
			b.add(new Book(name,writer));
			i+=1;
		}
		for(i=0; i<num; i++) {
			System.out.println(b.get(i).toString());
		}
		
		System.out.print("ã������ å�� ������>>");
		findName=sc.nextLine();
		for(i=0;i<num;i++) {
			if(b.get(i).getName().equals(findName)) {
				System.out.println("���ڴ� "+ b.get(i).getWriter());
				cnt++;
			}
		}
		if(cnt==0) System.out.println("ã������ å�� �����ϴ�.");
	}

}
