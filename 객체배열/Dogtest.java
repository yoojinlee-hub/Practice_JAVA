import java.util.*;
public class Dogtest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Dog[] dogArray = new Dog[3];
		int i;
		
		for(i=0;i<dogArray.length;i++) {
			System.out.print("pet�� �̸��� �Է��ϼ���:");
			String name = input.next();
			System.out.print("pet�� ������ �Է��ϼ���:");
			String type = input.next();
			dogArray[i] = new Dog(name,type);
		}
		input.close();
		
		System.out.println("** for�� **");
		for(i=0;i<dogArray.length;i++)
			System.out.println(dogArray[i].toString());
		
		System.out.println("** foreach�� **");
		for(Dog obj:dogArray)
			System.out.println(obj.toString());
	}

}
