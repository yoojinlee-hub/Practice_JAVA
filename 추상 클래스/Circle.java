public class Circle extends Shape{
    //원주율
    public final double PI = 3.14;

    //반지름
    double radius;

    //생성자
    public Circle(double radius){
        this.radius = radius;
    }

    //넓이
    public  double getArea(){
        return PI * radius * radius;
    }

    //둘레
    public double getPerimeter(){
        return 2 * PI * radius;
    }
}
