import java.util.*;
public class MagazineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Magazine m;
		String name, writer, release;
		int pages;

		System.out.print("���� �̸���?");
		name = sc.nextLine();
		System.out.print("����������?");
		pages = sc.nextInt();
		sc.nextLine(); //���۹���� �ٸ��Ͱ� ���� �� ���ش�
		System.out.print("���ڴ�?");
		writer = sc.nextLine();
		System.out.print("�߸�����?");
		release = sc.nextLine();
		
		m=new Magazine(name,writer,pages,release);
		System.out.println("å �̸� :"+ m.getName());
		System.out.println("������ �� :"+ m.getPages());
		System.out.println("���� :"+ m.getWriter());
		System.out.println("�߸��� :"+ m.getRelease());
	}

}
