public class Switch {
    public static void main(String[] args){
        int score = 97 ;
        String grade;

        switch (score / 10){
            case 10:
                grade = "A+"; //100점
                break;
            case 9:
                grade = "A"; //90-99점
                break;
            case 8:
                grade = "B"; //80-89점
                break;
            case 7:
                grade = "C"; //70-79점
                break;
            case 6:
                grade = "D"; //60-69점
                break;
            default: //else 아님
                grade = "F";
                break;
        }
        System.out.println(grade);
        switch (grade) {
            case "A+":
            case "A":
            case "B":
                System.out.println("참 잘했어요!");
                break;
            case "C":
            case "D":
                System.out.println("조금만 더 노력해 볼까요?");
                break;
            case "F":
                System.out.println("Fail 입니다");
            default:
                System.out.println("다시 수강해주세요.");
                break;
        }
    }
}
/*
switch (i % 3) { // i : 불린이 아닌 식, 변수, 메소드
    case 0:
        System.out.println("C 구역입니다.");
        break;
    case 1:
        System.out.println("A 구역입니다.");
        break;
    default:
        System.out.println("B 구역입니다.");
        break;
* */