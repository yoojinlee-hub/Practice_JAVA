import game.Dice;

public class DiceTest {

	public static void main(String[] args) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int i=1;
		while(true) { //while 무한루프 사용할 때: true
			System.out.println(i+"차: "+ "첫번째 주사위"+dice1.toString()+ ", 두번째 주사위"+ dice2.toString());
			i++;
			if(dice1.getValue()==dice2.getValue())
				break;
		}
			System.out.println("Dice 게임이 종료되었습니다");
	}

}
