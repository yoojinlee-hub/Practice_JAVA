import java.util.*;
public class StudentTest {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>(); 
		Scanner sc = new Scanner(System.in);
		String input;

		set.add(new Student("ȫ�浿",30));
		set.add(new Student("�̱浿",30));
		set.add(new Student("�̱浿",30));

		System.out.printf("�� ��ü��:%d\n", set.size());

		Iterator<Student> i = set.iterator(); //��ġ�� ���⿡ ������
		while(i.hasNext()) {
			Student s=i.next();
			System.out.println("�̸� : "+s.name+", ���� : "+s.age);
		}

		//////�˻�////////
		System.out.println("ã�� �̸��� �Է�:");
		input = sc.next();

		Iterator<Student> i2 = set.iterator(); //��ġ�� ���⿡ ������
		while(i2.hasNext()) {
			Student s=i2.next();
			if(s.name.equals(input))
				System.out.println("ã�� �����Ͱ� �ִ�.");
		}

		//////����////////
		System.out.println("�����Ϸ��� �̸��� �Է�:");
		input = sc.next();

		Iterator<Student> i3 = set.iterator(); //��ġ�� ���⿡ ������
		while(i3.hasNext()) {
			Student s=i3.next();
			if(s.name.equals(input)) {
				System.out.println(input+" �����Ͱ� ������");
				set.remove(s);
			}
		}
		
		/*
		////////�׽�Ʈ////////
		Iterator<Student> i4 = set.iterator(); //��ġ�� ���⿡ ������
		while(i4.hasNext()) {
			Student s=i4.next();
			System.out.println("�̸� : "+s.name+", ���� : "+s.age);
		}*/
	}

}
