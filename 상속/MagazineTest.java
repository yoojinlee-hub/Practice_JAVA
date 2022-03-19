import java.util.*;
public class MagazineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Magazine m;
		String name, writer, release;
		int pages;

		System.out.print("잡지 이름은?");
		name = sc.nextLine();
		System.out.print("페이지수는?");
		pages = sc.nextInt();
		sc.nextLine(); //동작방식이 다른것과 경계될 때 써준다
		System.out.print("저자는?");
		writer = sc.nextLine();
		System.out.print("발매일은?");
		release = sc.nextLine();
		
		m=new Magazine(name,writer,pages,release);
		System.out.println("책 이름 :"+ m.getName());
		System.out.println("페이지 수 :"+ m.getPages());
		System.out.println("저자 :"+ m.getWriter());
		System.out.println("발매일 :"+ m.getRelease());
	}

}
