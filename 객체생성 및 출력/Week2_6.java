import java.util.*;
public class Week2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Phone[] p = new Phone[2];
		String name, tel;
		int i=0;
		
		while(i<2) {
			System.out.print("�̸�, ��ȭ��ȣ�� �Է��ϼ���. >>");
			name=sc.next();
			tel=sc.next();
			p[i]=new Phone(name,tel);
			
			System.out.println(p[i].getName()+"�� ��ȣ�� "+p[i].getTel());
			i++;
		}
		sc.close();
	}

}
