public class String_class {
    public static void main(String[] args) {
        String myString = "aBc";
        System.out.println(myString.toUpperCase()) ;// 모두 대문자로
        System.out.println(myString.toLowerCase()); // 모두 소문자로
        System.out.println(myString);

        System.out.println(myString.toLowerCase() == "abc"); //false
        System.out.println(myString.toLowerCase().equals("abc")); //true
    }

}
