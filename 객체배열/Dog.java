
public class Dog {
	private String name;
	private String type;
	
	public Dog(String name,String type) {
		this.name=name;
		this.type=type;
	}
	//생성자
	public void setName(String name) { this.name= name;}
	public void setType(String type) { this.type= type;}
	//접근자
	public String getName() {return name;}
	public String getType() {return type;}
	
	public String toString() {
		return name+", "+type;
	}
}
