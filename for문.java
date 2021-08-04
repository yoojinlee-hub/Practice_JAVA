public class for문 {
    public static void main(String[] args){
        int sum = 0;
        for (int i=1; i<=5 ; i++){ //(초기화식;종결제어식;증감제어식)
            sum += i;
        }
        System.out.println(sum);
    }
}
/*int sum = 0;
for (int i = 1; i <= 100; i++) {
    sum += i;
}
System.out.println(sum);
* */