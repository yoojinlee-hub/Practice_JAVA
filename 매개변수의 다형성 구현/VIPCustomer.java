
class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio=0.1;
	double bonusRatio=0.05;
	static int num = 1;
	
	VIPCustomer(){
		this.customerGrade = "VIP";
		this.agentID=num++;
	}
	VIPCustomer(int ID,String name,int agentID){
		this.customerGrade = "VIP";
		this.customerID=ID;
		this.customerName=name;
		this.agentID=agentID;
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
	public int getAgentID() { return this.agentID; }
	public void setAgentID(int id) { this.agentID=id;}
}
