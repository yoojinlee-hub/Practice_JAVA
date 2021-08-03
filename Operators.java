public class Operators {
    public static void main(String[] args) {
        String myString = "Hello " + "Code";
        System.out.println(myString);
        System.out.println("숫자 연산자");
        int a = 9 ;
        double b = 5 ;
        // 자동형변환 - 소수형이 정수형 보다 힘이 세다!
        System.out.println(a + " + " + b + " = " + ( a + b ));
        System.out.println(a + " - " + b + " = " + ( a - b ));
        System.out.println(a + " * " + b + " = " + ( a * b ));
        System.out.println(a + " / " + b + " = " + ( a / b ));
        System.out.println(a + " % " + b + " = " + ( a % b ));

        System.out.println("비교연산자");
        System.out.println(3 + " > " + 2 + " : " + (3 > 2));
        System.out.println(3 + " < " + 2 + " : " + (3 < 2));
        System.out.println(3 + " >= " + 2 + " : " + (3 >= 2));
        System.out.println(3 + " <= " + 2 + " : " + (3 <= 2));
        System.out.println(3 + " == " + 2 + " : " + (3 == 2));
        System.out.println(3 + " != " + 2 + " : " + (3 != 2));

        //불린연산자 and=&& or=|| not=!
    }
}
