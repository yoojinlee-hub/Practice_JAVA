import java.util.*;
public class UserTest {

	public static void main(String[] args) {
		int num = 0;
		String i,p;
		User user;
		ArrayList<User> arr =new ArrayList<>();
		Scanner input= new Scanner(System.in);
		
		while(num!=4){
			System.out.println("=============================");
			System.out.println("1.Sign Up");
			System.out.println("2.Login");
			System.out.println("3.Print All Users");
			System.out.println("4. Exit");
			System.out.println("=============================");
			
			System.out.print("��ȣ�� �Է��Ͻÿ�");
			num=input.nextInt();
			
			if(num==1) {
				//���̵�� �Ľ����� ���Ӱ� �߰�
				System.out.print("id:");
				i=input.next();
				System.out.print("password:");
				p=input.next();
				arr.add(new User(i,p));
			}
			if(num==2) {
				System.out.print("id:");
				i=input.next();
				System.out.print("password:");
				p=input.next();
				user = new User(i,p);
				if(i.equals(user.userId)&&p.equals(user.password))
					System.out.println("�α��� ����");
				else
					System.out.println("�α��� ����");
			}
			if(num==3) {
				for(int j=0;j<arr.size();j++) {
					user=arr.get(j);
					System.out.println("{"+user.userId+","+user.password+"}");
				}
					
			}
			if(num==4)
				break;
		}
	}

}
