package game;
import java.util.*;
public class Dice {
	private int value;
	
	public Dice() { value=1;}
	public int roll()
	{
		Random rand = new Random(); //������ �������ִ� ���� Ŭ����. util ��Ű�� �ؿ� ����
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
