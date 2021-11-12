import java.util.*;
public class Driver {

	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList<>();
		Circle c1 = new Circle();
		Triangle t1 = new Triangle();
		Shape s1 = new Shape();
		
		list.add(c1);
		list.add(t1);
		list.add(s1);
		
		list.get(0).draw();
		list.get(1).draw();
		list.get(2).draw();
	}

}
