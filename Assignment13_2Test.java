import java.io.*;
import java.util.*;
public class Assignment13_2Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner scan;
		String num, name, phone, email;
		int temp=1;
		String path = "D:\\동덕여대\\4-1\\객체지향설계\\Week12\\Assignment13_2\\src\\result.txt";
		
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(path));
			do {
				System.out.print("사용자 번호를 입력하세요>>");
				num=input.next();
				if(num.equals("0")) break;
				System.out.print("사용자 이름을 입력하세요>>");
				name=input.next();
				System.out.print("사용자 전화번호를 입력하세요>>");
				phone=input.next();
				System.out.print("사용자 이메일을 입력하세요>>");
				email=input.next();
				
				pw.print(num);
				pw.print(",");
				pw.print(name);
				pw.print(",");
				pw.print(phone);
				pw.print(",");
				pw.print(email);
				pw.print(",");
				
				pw.flush();
				
				System.out.print("입력이 끝났으면 0, 계속 입력하려면 1을 입력하세요>>");
				temp=input.nextInt();
				if(temp==0) break;
				
			}while(true);
			
			System.out.print("검색할 사용자 번호를 입력하세요>>");
			num = input.next();
			
			scan = new Scanner(new File(path));
			String str = null;
			while (scan.hasNext()) {       
				scan.useDelimiter(",");
				str = scan.next();
				if(str.equals(num)) {
					break;
				}
			}
			str = scan.next();
			scan.useDelimiter(",");
			str = scan.next();
			System.out.println("사용자 번호 "+ num+"의 전화번호는 "+str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		

	}

}
