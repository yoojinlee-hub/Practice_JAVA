import java.io.*;
import java.util.*;
public class Assignment13_2Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner scan;
		String num, name, phone, email;
		int temp=1;
		String path = "D:\\��������\\4-1\\��ü���⼳��\\Week12\\Assignment13_2\\src\\result.txt";
		
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(path));
			do {
				System.out.print("����� ��ȣ�� �Է��ϼ���>>");
				num=input.next();
				if(num.equals("0")) break;
				System.out.print("����� �̸��� �Է��ϼ���>>");
				name=input.next();
				System.out.print("����� ��ȭ��ȣ�� �Է��ϼ���>>");
				phone=input.next();
				System.out.print("����� �̸����� �Է��ϼ���>>");
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
				
				System.out.print("�Է��� �������� 0, ��� �Է��Ϸ��� 1�� �Է��ϼ���>>");
				temp=input.nextInt();
				if(temp==0) break;
				
			}while(true);
			
			System.out.print("�˻��� ����� ��ȣ�� �Է��ϼ���>>");
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
			System.out.println("����� ��ȣ "+ num+"�� ��ȭ��ȣ�� "+str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		

	}

}
