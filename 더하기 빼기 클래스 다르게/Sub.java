
public class Sub {
	int a;
	int b;
	int result=0;
	
	void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	int calculate() {
		result = a-b;
		
		return result;
	}
}
