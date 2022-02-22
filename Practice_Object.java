
class Calculator{
	int x, y;

	public void printResult() {
		System.out.printf("%d+%d=%d\n",x,y,x+y);
		System.out.printf("%d-%d=%d\n",x,y,x-y);
		System.out.printf("%d/%d=%d\n",x,y,x/y);
		System.out.printf("%d*%d=%d\n",x,y,x*y);
	}
}
public class Practice_Object {
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.x = 30;
		calculator.y = 50;	
		
		calculator.printResult();
	}
	
}
