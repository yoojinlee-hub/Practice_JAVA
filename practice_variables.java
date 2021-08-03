public class practice_variables {
    //자료형, 변수의 이름(대소문자 구별, 숫자로 시작 불가, _$외의 특수문자 불가)
    public static void main(String[] args){
        int age; //정수형 변수
        age = 27 ;

        int num = 21 ;
        //age = 22.6 -> Error

        age = num;
        age = age + 1;

        System.out.print("Hello, I'm ");
        System.out.print(age);
        System.out.print(".");
        // println : 자동으로 줄바꿈
    }
}
