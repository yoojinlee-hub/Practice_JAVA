public class Main {
    public static void main(String[] args) {
        int num = 10000;
        int key = 153;

        // 여기에 코드를 작성하세요.
        int i=1;
        int ex = 0;
        while (key*i <= num){
            ex = key*i;
            i++;
        }
        System.out.println(ex);
    }
}
/*
int num = 10000;
int key = 153;

while (num % key > 0) {
    // 코드를 작성하세요.
}
*/