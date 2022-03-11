import java.util.*;
public class Week2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Phone[] p = new Phone[2];
		String name, tel;
		int i=0;
		
		while(i<2) {
			System.out.print("이름, 전화번호를 입력하세요. >>");
			name=sc.next();
			tel=sc.next();
			p[i]=new Phone(name,tel);
			
			System.out.println(p[i].getName()+"의 번호는 "+p[i].getTel());
			i++;
		}
		sc.close();
	}

}
