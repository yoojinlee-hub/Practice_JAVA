
class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade="silver";
	int bonusPoint;
	double saleRatio=0.01;
	double bonusRatio=0.01;
	
	Customer(){
	}
	Customer(int ID,String name){
		this.customerID=ID;
		this.customerName=name;
	}
	double calcPrice(int price){
		double newPrice;
		newPrice = price - price*this.saleRatio;
		return newPrice;
	}
	double calcBonus(int price) {
		double bonus;
		bonus = price * this.bonusRatio;
		return bonus;
	}
	void getCustomerInfo(){
		System.out.println(this.customerName+" ���� ����� "+this.customerGrade+"�̸�, ���ʽ� ����Ʈ�� "+this.bonusPoint+"�Դϴ�.");
	}
	
	public String getCustomerName() { return this.customerName; }
	public String getCustomerGrade() { return this.customerGrade; }
	public int getCustomerID() { return this.customerID; }
	
	public void setCustomerName(String name) { this.customerName=name;}
	public void setCustomerGrade(String grade) { this.customerGrade=grade;}
	public void setCustomerID(int id) { this.customerID=id;}
}
