public class WrapperClass {
    public static void main(String[] args) {
        //기본형 자료형(Primitive Type)을 참조형(Reference Type)처럼 다루어야할 때
        Integer i = new Integer(123);
        Integer i1 = 123;

        System.out.println(123 == 123); //true
        System.out.println(new Integer(123) == new Integer(123)); //false

        System.out.println(new Integer(123).equals(new Integer(123))); //true
        
    }
}
