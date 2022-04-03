
class GoldCustomer extends Customer{
	double bonusRatio = 0.02;
	double saleRatio = 0.1;
	
	GoldCustomer(){
		this.customerGrade = "VIP";
	}
	GoldCustomer(int ID,String name){
		this.customerGrade = "VIP";
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
}

