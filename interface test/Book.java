import java.util.Date;

public class Book implements Lendable{
	Date d = new Date();
	String title;
	String borrower;
	String code;
	String writer;
	String CheckOutDate; //������
	int state=0;
	
	Book(){
		state=0;
	}
	Book(String b,String date){
		this.borrower=b;
		this.CheckOutDate=date;
		state=0;
	}
	Book(String code,String t,String w){
		this.code=code;
		this.title=t;
		this.writer=w;
		state=0;
	}
	@Override
	public void checkOut(String borrower, Date date) {
		this.borrower=borrower;
		this.d=date;
		if(state==0) {
			System.out.println("**"+this.title+"��(��) ����Ǿ����ϴ�");
			System.out.println("������:" + this.borrower);
			System.out.println("������:"+d);
			state=1;
		}
		else {
			System.out.println("�̹� ����Ǿ����ϴ�");
		}
		
	}

	@Override
	public void checkIn() {
		if(state==1) {
			System.out.println("**"+this.title+"��(��) �ݳ��Ǿ����ϴ�");
			state=0;
		}else {
			System.out.println("�̹� �ݳ��Ǿ����ϴ�");
		}
	}

}
