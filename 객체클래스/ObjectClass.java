public class ObjectClass {
    public static void main(String[] args){
        ObjectClass2 person = new ObjectClass2("유진","김");

        // Object 최상위 클래스, 모든 클래스의 부모 클래스
        //Object object = new Object();

        System.out.println(person.toString()); //유진 김
        System.out.println(person); //유진 김
    }
}
