import java.util.*;
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> b = new ArrayList<>();
		String findName, name, writer;
		int i=0,num,cnt=0;
		
		System.out.print("책의 권수>>");
		num=sc.nextInt();
		
		sc.nextLine();
		while(i<num) {
			System.out.printf("제목>>");
			name=sc.nextLine();
			System.out.printf("저자>>");
			writer=sc.nextLine();
			b.add(new Book(name,writer));
			i+=1;
		}
		for(i=0; i<num; i++) {
			System.out.println(b.get(i).toString());
		}
		
		System.out.print("찾으려는 책의 제목은>>");
		findName=sc.nextLine();
		for(i=0;i<num;i++) {
			if(b.get(i).getName().equals(findName)) {
				System.out.println("저자는 "+ b.get(i).getWriter());
				cnt++;
			}
		}
		if(cnt==0) System.out.println("찾으려는 책이 없습니다.");
	}

}
