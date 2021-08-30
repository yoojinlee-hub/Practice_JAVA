public abstract class Shape {
    public double x,y;

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }
    //넓이
    public abstract double getArea();

    //둘레
    public abstract double getPerimeter();
}
