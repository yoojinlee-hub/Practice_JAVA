import java.util.Date;

class CD implements Lendable{
	String registerNo;
	Date d = new Date();
	String cdTitle;
	String borrower;
	String CheckOutDate;
	int state=0;
	
	CD(){}
	CD(String no, String title){
		this.registerNo=no;
		this.cdTitle=title;
	}
	public void checkOut() {}
	public void checkIn() {
		if(state==1) {
			System.out.println("**"+this.cdTitle+"��(��) �ݳ��Ǿ����ϴ�");
			state=0;
		}else {
			System.out.println("�̹� �ݳ��Ǿ����ϴ�");
		}
	}
	@Override
	public void checkOut(String borrower, Date date) {
		this.borrower=borrower;
		this.d=date;
		// TODO Auto-generated method stub
		if(state==0) {
			System.out.println("**"+this.cdTitle+"��(��) ����Ǿ����ϴ�");
			System.out.println("������:" + this.borrower);
			System.out.println("������:"+d);
			state=1;
		}
		else {
			System.out.println("�̹� ����Ǿ����ϴ�");
		}
		
	}
}
