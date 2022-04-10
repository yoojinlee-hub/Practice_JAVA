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
			System.out.println("**"+this.cdTitle+"이(가) 반납되었습니다");
			state=0;
		}else {
			System.out.println("이미 반납되었습니다");
		}
	}
	@Override
	public void checkOut(String borrower, Date date) {
		this.borrower=borrower;
		this.d=date;
		// TODO Auto-generated method stub
		if(state==0) {
			System.out.println("**"+this.cdTitle+"이(가) 대출되었습니다");
			System.out.println("대출인:" + this.borrower);
			System.out.println("대출일:"+d);
			state=1;
		}
		else {
			System.out.println("이미 대출되었습니다");
		}
		
	}
}
