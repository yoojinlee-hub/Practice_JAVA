
public class PointTest {

	public static void main(String[] args) {
		Point a = new Point(2,3);
		Point aa =a;
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		
		System.out.println("a와 b는 "+ a.equals(a,b,1));
		System.out.println("a와 aa는 "+ a.equals(a,aa,1)+"(a==aa)");
		System.out.println("a "+ a.equals(a,b)+ " b");
		System.out.println("a "+ a.equals(a,c)+" c");
	}

	

}
