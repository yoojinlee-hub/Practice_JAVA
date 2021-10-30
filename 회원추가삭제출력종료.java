import java.util.*;
public class Member {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String>mem=new ArrayList<>();
		int num=0;
		
		while(true) {
			
			System.out.println("1. 회원 추가 2. 회원 삭제 3. 회원 출력 4. 종료");
			
			
			System.out.print("메뉴를 선택:");
			num = input.nextInt();
			if(num!=1&&num!=2&&num!=3&&num!=4)
				System.out.println("입력이 잘못됐습니다.");
			if(num==1) {
				String temp;
				boolean n;
				System.out.print("추가할 회원의 이름:");
				temp = input.next();
				n=mem.contains(temp);
				if(!n)
					mem.add(temp);
				else
					System.out.println("이미 존재하는 회원");
				
			}
			if(num==2) {
				String temp;
				boolean n;
				System.out.print("삭제할 회원의 이름:");
				temp = input.next();
				n=mem.contains(temp);
				if(n)
					mem.remove(temp);
				else
					System.out.println("존재하지 않음");
			}
			if(num==3) {
System.out.println("*회원리스트*");
				for(String i : mem) { //for문을 통한 전체출력
					
				    System.out.println(i);
				}
			}
				
			if(num==4)
				break;
			
		}
		
		
	}


}
