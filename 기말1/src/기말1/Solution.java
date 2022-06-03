
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
		String pwd = sc.next();
        //코드 작성
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
    
    // login()메소드 작성
    public static void login()
    {
    	System.out.println("로그인 성공");
        
    }        
}
class NotExistIDException extends Exception {
    
    //코드 작성
	public NotExistIDException() {
		System.out.println("아이디 없음");
	}
    
}
class WrongPasswordException extends Exception {
 
    //코드 작성
    public WrongPasswordException() {
    	System.out.println("패스워드 틀림");
    }
}