import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Person p1 = new Person();
		Person p2;
		String name;
		float height;
		float weight;
		
		p1.name="ȫ�浿";
		p1.height=163.0F;
		p1.weight=48.5F;
		
		System.out.print("�̸���? :");
		name = input.nextLine();
		System.out.print("Ű��? :");
		height = input.nextFloat();
		System.out.print("�����Դ�? :");
		weight = input.nextFloat();
		
		p2 = new Person(name,height,weight);
		
		p1.print();
		p2.print();
		input.close();
	}

}
