
class Student {
	String name;
	int age;
	
	public Student(String name,int age) {
		this.age=age;
		this.name=name;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Student) {
			Student s = (Student) o;
			return s.name.equals(name)&&(s.age==age);
		}else
			return false;
	}
	
	//name�� age���� ������ ������ hashcode ����
	public int hashCode() {
		return name.hashCode()+age;
	}
}
