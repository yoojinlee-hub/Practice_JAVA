import java.lang.Math; //수학
import java.util.Random; //랜덤

public class MathClass {
    public static void main(String[] args) {
        //절댓값
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(8));

        //최솟값, 최대값
        System.out.println(Math.min(4, 10));  // 최솟값
        System.out.println(Math.max(4, 10));  // 최댓값

        //랜덤
        Random rand = new Random();
        System.out.println(rand.nextInt(10));   // 0 이상 9 이하의 랜덤한 값

        //랜덤2
        Random rand1 = new Random();
        int min = 10;
        int max = 30;

        System.out.println(rand1.nextInt((max - min) + 1) + min);   // 10 이상 30 이하의 랜덤한 값
    }
}
