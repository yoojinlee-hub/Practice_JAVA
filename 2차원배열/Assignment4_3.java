import java.util.Scanner;

public class Assignment4_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] members = null;
		String name, phone;
		int scNum=0, countPerson = 0;
		int temp = 0,temp2=0;
		
		while(true) {
			System.out.println("-----------------------------");
			System.out.println("1. ȸ���� | 2. �����Է� | 3. ȸ������Ʈ | 4. ����");
			System.out.println("-----------------------------");
			
			System.out.print("����>");
			scNum = sc.nextInt();
			
			if(scNum==1) {
				System.out.print("ȸ����>");
				countPerson = sc.nextInt();
				members = new String[countPerson][2];
				temp=1;
			}
			else if(scNum==2) {
				if(temp==0) 
					System.out.println("ȸ������ ������ �ʾҽ��ϴ�.");
				
				for(int i=0; i < countPerson ; i++) {
					System.out.print("�̸��� �Է��ϼ���:");
					name = sc.next();
					System.out.print("��ȣ�� �Է��ϼ���:");
					phone = sc.next();
					members[i][0]=name;
					members[i][1]=phone;
					temp2=1;
				}
			}
			else if(scNum==3) {
				if(temp==0 || temp2 ==0) {
					System.out.println("ȸ���� �Ǵ� ������ �Է����� �ʾҽ��ϴ�.");
				}
					
				System.out.println(" ** ȸ������ **");
				for(int i=0; i < countPerson ; i++) 
					System.out.println(members[i][0] + " " + members[i][1]);
			}
			else if(scNum==4)
				break;
			else {
				System.out.println("�ٽ� �Է��ϼ���");
			}
		}

	}

}
