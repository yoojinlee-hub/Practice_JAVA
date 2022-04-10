import java.util.*;
public class A6_1Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d = new Date();
		Lendable[] arr;
		String code, writer, title;
		String name;
		int count, i=0;
		int inputNum;
		
		System.out.print("대출하려는 책이나 CD의 숫자는>>");
		count=sc.nextInt();
		arr = new Lendable[count];
		sc.nextLine();
		while(count>i) {
			System.out.print("책을 대출하면 1번, cd를 대출하면 2번을 선택하세요>>");
			inputNum = sc.nextInt();
			
			if(inputNum==1) {
				System.out.print("책의 청구번호:");
				code = sc.next();
				sc.nextLine();
				System.out.print("책 제목");
				title = sc.nextLine();
				System.out.print("책 저자");
				writer = sc.nextLine();
				arr[i]=new Book(code,title,writer);
			}
			else if(inputNum==2) {
				System.out.print("cd의 청구번호:");
				code = sc.nextLine();
				System.out.print("cd 제목");
				title = sc.nextLine();
				arr[i]=new CD(code,title);
			}
			i++;
			
		}
		System.out.print("대출하는 사람의 이름은:");
		name=sc.next();
		i=0;
		while(count>0) {
			arr[i].checkOut(name, d);
			i++;count--;
		}
	}

}
