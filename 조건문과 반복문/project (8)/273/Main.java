public class Main {
    public static void main(String[] args) {
        int number = 134354;
        String whatPrint = null;
        // 여기에 코드를 작성하세요.
        switch (number % 7){
            case 1:
                whatPrint = "One";
                break;
            case 2:
                whatPrint = "Two";
                break; 
            case 3:
                whatPrint = "Three";
                break;  
            case 4:
                whatPrint = "Four";
                break;  
            case 5:
                whatPrint = "Five";
                break;
            case 6:
                whatPrint = "Six";
                break;
            default:
                whatPrint = "Zero";
                break;
        }
        System.out.println(whatPrint);
    }
}