class NumberThread extends Thread { 
	public void run() { // start 메소드로 호출
		for (int i = 0; i < 100; i++) {
			System.out.print(i+",");
		}
	}
}
class CharThread extends Thread {
	public void run() { 
		// a부터 z까지 출력
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i+",");
		}
	} 
}
public class Practice_Thread {
//여러 가지 일을 동시에 수행할 수 있답니다.
	public static void main(String[] args) {
		// NumberThread 클래스 인스턴스 생성
		Thread thread1 = new NumberThread();
		// CharThread 클래스 인스턴스 생성
		Thread thread2 = new CharThread();
				
		thread1.start(); // NumberThread 시작 (run 메소드 호출)
		thread2.start(); // CharThread 시작 (run 메소드 호출)

	}

}
