import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Person p1 = new Person();
		Person p2;
		String name;
		float height;
		float weight;
		
		p1.name="홍길동";
		p1.height=163.0F;
		p1.weight=48.5F;
		
		System.out.print("이름은? :");
		name = input.nextLine();
		System.out.print("키는? :");
		height = input.nextFloat();
		System.out.print("몸무게는? :");
		weight = input.nextFloat();
		
		p2 = new Person(name,height,weight);
		
		p1.print();
		p2.print();
		input.close();
	}

}
