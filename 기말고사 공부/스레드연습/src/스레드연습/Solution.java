package 스레드연습;

import java.util.Scanner;
public class Solution {
	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();

		synchronized (b) {			
			// 코드 작성
            b.run();
            System.out.println(b.total);
            
		}
	}
}

class ThreadB extends Thread {
	Scanner sc= new Scanner(System.in);
	int total=0;
	int num1=10;
	int num2=20;
	
	@Override
	public void run() {
		num1=sc.nextInt();
		num2=sc.nextInt();
		for(int i=num1;i<=num2;i++) {
			total+=i;
		}
	}
		
}