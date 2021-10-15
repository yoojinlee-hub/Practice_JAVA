
public class Assignment7_2 {

	public static void main(String[] args) {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		int total=0;
		int i=0;
		
		while(total!=2) {
			d1.roll();
			d2.roll();
			System.out.println("주사위1= "+d1.getValue()+" 주사위2= "+d2.getValue());
			total = d1.getValue() + d2.getValue();
			i++;
		}
		
		System.out.println("("+d1.getValue()+","+d2.getValue()+")이 나오는데 걸린 횟수="+ i);
			
	}

}
