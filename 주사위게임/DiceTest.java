import game.Dice;

public class DiceTest {

	public static void main(String[] args) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int i=1;
		while(true) { //while ���ѷ��� ����� ��: true
			System.out.println(i+"��: "+ "ù��° �ֻ���"+dice1.toString()+ ", �ι�° �ֻ���"+ dice2.toString());
			i++;
			if(dice1.getValue()==dice2.getValue())
				break;
		}
			System.out.println("Dice ������ ����Ǿ����ϴ�");
	}

}
