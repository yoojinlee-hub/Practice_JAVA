
public class Noodle implements Delivery{
	String[] menu = {"Į����","�ø�","�̸�","���","�ұ���"};
	int[] price = {7000,11000,8000,4000,10000};
	int money=0;
	String name;
	int i;
	
	public Noodle(String name) {
		this.name=name;
	}

	@Override
	public int getTotalPrice() {
		for(i=0;i<5;i++) 
			if(this.name.equals(menu[i]))
				money=price[i];

		return money;
	}

}
