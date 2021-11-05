import java.util.*;
public class Dogtest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Dog[] dogArray = new Dog[3];
		int i;
		
		for(i=0;i<dogArray.length;i++) {
			System.out.print("pet의 이름을 입력하세요:");
			String name = input.next();
			System.out.print("pet의 종류을 입력하세요:");
			String type = input.next();
			dogArray[i] = new Dog(name,type);
		}
		input.close();
		
		System.out.println("** for문 **");
		for(i=0;i<dogArray.length;i++)
			System.out.println(dogArray[i].toString());
		
		System.out.println("** foreach문 **");
		for(Dog obj:dogArray)
			System.out.println(obj.toString());
	}

}
