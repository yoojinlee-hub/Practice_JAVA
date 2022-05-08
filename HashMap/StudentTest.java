import java.util.*;
public class StudentTest {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>(); 
		Scanner sc = new Scanner(System.in);
		String input;

		set.add(new Student("홍길동",30));
		set.add(new Student("이길동",30));
		set.add(new Student("이길동",30));

		System.out.printf("총 객체수:%d\n", set.size());

		Iterator<Student> i = set.iterator(); //위치를 여기에 놔야함
		while(i.hasNext()) {
			Student s=i.next();
			System.out.println("이름 : "+s.name+", 나이 : "+s.age);
		}

		//////검색////////
		System.out.println("찾는 이름을 입력:");
		input = sc.next();

		Iterator<Student> i2 = set.iterator(); //위치를 여기에 놔야함
		while(i2.hasNext()) {
			Student s=i2.next();
			if(s.name.equals(input))
				System.out.println("찾는 데이터가 있다.");
		}

		//////삭제////////
		System.out.println("삭제하려는 이름을 입력:");
		input = sc.next();

		Iterator<Student> i3 = set.iterator(); //위치를 여기에 놔야함
		while(i3.hasNext()) {
			Student s=i3.next();
			if(s.name.equals(input)) {
				System.out.println(input+" 데이터가 삭제됨");
				set.remove(s);
			}
		}
		
		/*
		////////테스트////////
		Iterator<Student> i4 = set.iterator(); //위치를 여기에 놔야함
		while(i4.hasNext()) {
			Student s=i4.next();
			System.out.println("이름 : "+s.name+", 나이 : "+s.age);
		}*/
	}

}
