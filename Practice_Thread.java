class NumberThread extends Thread { 
	public void run() { // start �޼ҵ�� ȣ��
		for (int i = 0; i < 100; i++) {
			System.out.print(i+",");
		}
	}
}
class CharThread extends Thread {
	public void run() { 
		// a���� z���� ���
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i+",");
		}
	} 
}
public class Practice_Thread {
//���� ���� ���� ���ÿ� ������ �� �ִ�ϴ�.
	public static void main(String[] args) {
		// NumberThread Ŭ���� �ν��Ͻ� ����
		Thread thread1 = new NumberThread();
		// CharThread Ŭ���� �ν��Ͻ� ����
		Thread thread2 = new CharThread();
				
		thread1.start(); // NumberThread ���� (run �޼ҵ� ȣ��)
		thread2.start(); // CharThread ���� (run �޼ҵ� ȣ��)

	}

}
