
class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	Customer(){
		this.customerGrade="silver";
		this.bonusRatio=0.01;
	}
	Customer(int ID,String name){
		this.customerGrade="silver";
		this.bonusRatio=0.01;
		this.customerID=ID;
		this.customerName=name;
	}
	double calcPrice(int price){
		double newPrice;
		newPrice = price - price*this.bonusRatio;
		return newPrice;
	}
	void getCustomerInfo(){
		System.out.println(this.customerName+" 님의 등급은 "+this.customerGrade+"이며, 보너스 포인트는 "+this.bonusPoint+"입니다.");
	}
	
	public String getCustomerName() { return this.customerName; }
	public String getCustomerGrade() { return this.customerGrade; }
	public int getCustomerID() { return this.customerID; }
	
	public void setCustomerName(String name) { this.customerName=name;}
	public void setCustomerGrade(String grade) { this.customerGrade=grade;}
	public void setCustomerID(int id) { this.customerID=id;}
}
