
public class Dice {
	private int value;
	
	public Dice() {}
	public void roll() {
		value = ((int)(Math.random()*6) + 1);
	}
	public int getValue() { return value;	}
	public void setValue() { this.value = value;	}
}
