
public class Person {
	String name;
	float height;
	float weight;
	
	Person(){}
	Person(String name,float height,float weight){
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	void print() {
		System.out.println("�̸� : "+name+", Ű: "+height+", ������ : "+ weight);
	}
}
