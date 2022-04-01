
class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	static int num = 1;
	
	VIPCustomer(){
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.agentID=num++;
	}
	VIPCustomer(int ID,String name,int agentID){
		this.customerGrade = "VIP";
		this.customerID=ID;
		this.bonusRatio = 0.05;
		this.customerName=name;
		this.agentID=agentID;
	}
	double calcPrice(int price) {
		double newPrice;
		newPrice = price - price*this.bonusRatio;
		return newPrice;
	}
	
	public int getAgentID() { return this.agentID; }
	public void setAgentID(int id) { this.agentID=id;}
}
