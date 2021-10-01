import java.util.Scanner;

public class Assignment5_6 {

	public static void main(String[] args) {
		String name;
		String juso;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요:  ");
		name = input.next();
		
		input.nextLine(); //동작방식이 다른 것과 경계되는 부분에 써준다!
		
		System.out.print("주소를 입력하세요:  ");
		juso = input.nextLine();
		
		address(name,juso);

	}
	
	public static void address(String n, String add) {
		System.out.println(n + "의 주소는 "+ add +"입니다.");
	}

}
