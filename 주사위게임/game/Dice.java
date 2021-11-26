package game;
import java.util.*;
public class Dice {
	private int value;
	
	public Dice() { value=1;}
	public int roll()
	{
		Random rand = new Random(); //난수를 생성해주는 랜덤 클래스. util 패키지 밑에 있음
		int num = rand.nextInt(6)+1;
		return num;
	}
	public int getValue() {return value;}
	public void setValue() { this.value=roll();}
	public String toString() {
		this.setValue();
		return "= "+this.getValue();
	}
}
