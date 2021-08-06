public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성하세요.
        int[] intArray = new int[30];
        String[] reminders = {"Zero", "One", "Two", "Three"};
        for (int i=0 ; i<intArray.length; i++) {
            intArray[i] = 1001 + i ;
        }
        for (int x: intArray){
            System.out.println(reminders[x%4]);
        }
    }
}