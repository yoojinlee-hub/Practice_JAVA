import java.util.*;
public class Member {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String>mem=new ArrayList<>();
		int num=0;
		
		while(true) {
			
			System.out.println("1. ȸ�� �߰� 2. ȸ�� ���� 3. ȸ�� ��� 4. ����");
			
			
			System.out.print("�޴��� ����:");
			num = input.nextInt();
			if(num!=1&&num!=2&&num!=3&&num!=4)
				System.out.println("�Է��� �߸��ƽ��ϴ�.");
			if(num==1) {
				String temp;
				boolean n;
				System.out.print("�߰��� ȸ���� �̸�:");
				temp = input.next();
				n=mem.contains(temp);
				if(!n)
					mem.add(temp);
				else
					System.out.println("�̹� �����ϴ� ȸ��");
				
			}
			if(num==2) {
				String temp;
				boolean n;
				System.out.print("������ ȸ���� �̸�:");
				temp = input.next();
				n=mem.contains(temp);
				if(n)
					mem.remove(temp);
				else
					System.out.println("�������� ����");
			}
			if(num==3) {
System.out.println("*ȸ������Ʈ*");
				for(String i : mem) { //for���� ���� ��ü���
					
				    System.out.println(i);
				}
			}
				
			if(num==4)
				break;
			
		}
		
		
	}


}
