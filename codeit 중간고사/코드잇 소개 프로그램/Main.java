public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        boolean inMainMenu = true;
        while(inMainMenu){
            System.out.println("(I)ntro (C)ourses (E)xit");
            
            switch(scanner.next()){
                case "I": case "i": 
                    System.out.println("안녕하세요! 우리는 코드잇입니다.\n"+"함께 공부합시다!");
                    break;
                case "C": case "c":
                    boolean inCourseMenu = true;
                    while(inCourseMenu){
                        System.out.println("코드잇 수업을 소개합니다\n"+"(P)ython (J)ava (i)os (B)ack");
                    }   switch(scanner.next()){
                            case "P": case"p":
                                System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다");
                                System.out.println("강사: A");
                                System.out.println("추천 선수과목: 없음");
                                break;
                            case "J": case"j":
                                 System.out.println("Java 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다");
                                System.out.println("강사: B");
                                System.out.println("추천 선수과목: Python");
                                break;
                            case "I": case"i":
                                System.out.println("ios 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다");
                                System.out.println("강사: C");
                                System.out.println("추천 선수과목: Python,Java");
                                break;
                            case "B": case"b":
                                inCourseMenu=false;
                                break;
                            default:
                                System.out.println("다시 입력해 주세요.");
                                break;
                        }
                    break;
                case "E": case "e":
                    System.out.println("안녕히 가세요.");
                    inMainMenu = false;
                    break;
                default:
                    System.out.println("다시 입력해 주세요");
                    break;
            }
        }
    }
}