
public class Prn9090 implements ColorPrintable{

	@Override
	public void print(String doc) {
		System.out.println("black & white");
		print();
	}

	@Override
	public void printCMYK(String doc) {
		System.out.println("color ver");
		print();
	}
	
	public void print() {
		System.out.println("This is a printer driver");
	}
	
}
