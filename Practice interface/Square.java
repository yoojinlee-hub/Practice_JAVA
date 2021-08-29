public class Square implements Shape{
    //길이
    double side;

    //생성자
    public Square(double side){
        this.side=side;
    }

    //넓이
    public double getArea(){
        return side*side;
    }

    //둘레
    public double getPerimeter(){
        return 4*side;
    }
}
