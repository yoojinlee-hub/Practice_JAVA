
public class Point {
	int x,y;
	
	Point(){}
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public String equals(Point a, Point b,int num) {
		if(a==b)
			return "�ּҰ� ����";
		else
			return "�ּҰ� �ٸ���";
	}
	public String equals(Point a, Point b) {
		if(a.x==b.x||a.y==b.y)
			return "is equal to";
		else
			return "is not equal to";
	}
}
