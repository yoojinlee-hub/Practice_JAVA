
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
		String pwd = sc.next();
        //�ڵ� �ۼ�
		int a=0;
        if(id.equals("java")) {
        	a+=1;
        }else {
        	NotExistIDException e = new NotExistIDException();
        }
        if(pwd.equals("1234")) {
        	a+=1;
        }else {
        	WrongPasswordException ee = new WrongPasswordException();
        }
        if(a==2)
        	login();
    }
    
    // login()�޼ҵ� �ۼ�
    public static void login()
    {
    	System.out.println("�α��� ����");
        
    }        
}
class NotExistIDException extends Exception {
    
    //�ڵ� �ۼ�
	public NotExistIDException() {
		System.out.println("���̵� ����");
	}
    
}
class WrongPasswordException extends Exception {
 
    //�ڵ� �ۼ�
    public WrongPasswordException() {
    	System.out.println("�н����� Ʋ��");
    }
}