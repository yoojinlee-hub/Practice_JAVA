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
		
		System.out.print("�����Ϸ��� å�̳� CD�� ���ڴ�>>");
		count=sc.nextInt();
		arr = new Lendable[count];
		sc.nextLine();
		while(count>i) {
			System.out.print("å�� �����ϸ� 1��, cd�� �����ϸ� 2���� �����ϼ���>>");
			inputNum = sc.nextInt();
			
			if(inputNum==1) {
				System.out.print("å�� û����ȣ:");
				code = sc.next();
				sc.nextLine();
				System.out.print("å ����");
				title = sc.nextLine();
				System.out.print("å ����");
				writer = sc.nextLine();
				arr[i]=new Book(code,title,writer);
			}
			else if(inputNum==2) {
				System.out.print("cd�� û����ȣ:");
				code = sc.nextLine();
				System.out.print("cd ����");
				title = sc.nextLine();
				arr[i]=new CD(code,title);
			}
			i++;
			
		}
		System.out.print("�����ϴ� ����� �̸���:");
		name=sc.next();
		i=0;
		while(count>0) {
			arr[i].checkOut(name, d);
			i++;count--;
		}
	}

}
