public class Main {
    public static void main(String[] args) {
        int a = 38, b = 27;
        
        // 여기에 코드를 작성하세요.
        if ( a == b ){
            System.out.println(a);
        } else if (a != b){
            if(a >b ){
                System.out.println("a가 b보다 "+ (a - b) +"만큼 더 큽니다");
            } else {
                System.out.println("b가 a보다 "+ (b - a) +"만큼 더 큽니다");
            }
        }
    }
}