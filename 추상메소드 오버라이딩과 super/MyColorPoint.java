
public class MyColorPoint extends MyPoint{
	String color;
	public MyColorPoint(int x,int y,String color) {
		super(x,y);
		this.color=color;
	}
	@Override
	protected void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	protected void reverse() {
		int temp;
		temp=x;
		x=y;
		y=temp;
	}
	protected void show() {
		super.show();
		System.out.print(","+color);
	}
}
