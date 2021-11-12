import java.util.*;

public class BankAccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankAccount b0 = new BankAccount();
		BankAccount b1 = new BankAccount("소년",2000);
		BankAccount b2 = new BankAccount("아이유",500,3.25);
		int money;
		b0.setName("방탄");
		b0.setBalance(100);
		b0.setInterest(3.5);

		b1.setInterest(2.1);

		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println();
		//첫번째 계좌에 입금
		System.out.print("계좌"+b0.getAccNo()+"에 입금할 금액을 입력하세요:");
		money = input.nextInt();
		if(b0.deposit(money)) {
			System.out.println("입금이 성공했습니다.");
			b0.setBalance(b0.getBalance()+money);

		}else
			System.out.println("입금이 실패했습니다.");

		System.out.println();
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());

		//2번째 계좌에서 출금
		System.out.println();
		System.out.print("계좌"+b1.getAccNo()+"에 출금할 금액을 입력하세요:");
		money = input.nextInt();
		if(b1.withdraw(money)) {
			System.out.println("출금이 성공했습니다.");
			b1.setBalance(b1.getBalance()-money);

		}else
			System.out.println("출금이 실패했습니다.");

		System.out.println();
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());

		//2번계좌에서 3번계좌로 송금
		System.out.println();
		System.out.print("계좌"+b1.getAccNo()+"에서 계좌"+b2.getAccNo()+"으로 송금할 금액을 입력하세요:");
		money = input.nextInt();
		if(b1.transfer(b1,b2,money)) {
			System.out.println("송금이 성공했습니다.");
			
		}else
			System.out.println("송금이 실패했습니다.");

		System.out.println();
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());

		input.close();
	}

}
