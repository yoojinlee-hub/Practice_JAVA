class Student{
	String name;
	int x,y,z;
	Student(String name,int x,int y,int z){
		this.name=name;
		this.x=x;
		this.y=y;
		this.z=z;
	}
	float getAverage() {
		return (float)(x+y+z)/3;
	}
}
public class Practice_average {

	public static void main(String[] args) {
		Student student1 = new Student("�ڹ�", 100, 80, 75);
		Student student2 = new Student("�躯��", 96, 58, 90);
		
		System.out.printf("%s�� ��� ����:%f\n",student1.name,student1.getAverage());
		System.out.printf("%s�� ��� ����:%f\n",student2.name,student2.getAverage());
	}

}
