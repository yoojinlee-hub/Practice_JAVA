
public class Point {
	int x,y;
	
	Point(){}
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public String equals(Point a, Point b,int num) {
		if(a==b)
			return "주소가 같다";
		else
			return "주소가 다르다";
	}
	public String equals(Point a, Point b) {
		if(a.x==b.x||a.y==b.y)
			return "is equal to";
		else
			return "is not equal to";
	}
}
