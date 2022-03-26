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
			System.out.println("1. 회원수 | 2. 정보입력 | 3. 회원리스트 | 4. 종료");
			System.out.println("-----------------------------");
			
			System.out.print("선택>");
			scNum = sc.nextInt();
			
			if(scNum==1) {
				System.out.print("회원수>");
				countPerson = sc.nextInt();
				members = new String[countPerson][2];
				temp=1;
			}
			else if(scNum==2) {
				if(temp==0) 
					System.out.println("회원수를 정하지 않았습니다.");
				
				for(int i=0; i < countPerson ; i++) {
					System.out.print("이름을 입력하세요:");
					name = sc.next();
					System.out.print("번호를 입력하세요:");
					phone = sc.next();
					members[i][0]=name;
					members[i][1]=phone;
					temp2=1;
				}
			}
			else if(scNum==3) {
				if(temp==0 || temp2 ==0) {
					System.out.println("회원수 또는 정보를 입력하지 않았습니다.");
				}
					
				System.out.println(" ** 회원정보 **");
				for(int i=0; i < countPerson ; i++) 
					System.out.println(members[i][0] + " " + members[i][1]);
			}
			else if(scNum==4)
				break;
			else {
				System.out.println("다시 입력하세요");
			}
		}

	}

}
