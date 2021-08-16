public class ShapePrinter {
    public void printFloydsPyramid(int height) {
        // 숫자 자리수 구하기
        //정수형을 문자열로 변환하기 위해서는 String.valueOf(숫자)처럼 메소드를 사용합니다. 또한 문자열의 길이를 파악하기 위해서는 문자열.length()처럼 메소드를 씁니다.
        int length = String.valueOf(height * (height + 1) / 2).length();
        // 인쇄될 수
        int number = 1;
        // 반복문 1 - 행을 바꾸는 반복문
        for (int row = 1; row <= height; row++) {
            //한 행에서 인쇄될 내용을 담는 문자열 선언
            String line="";
            //반복문 2 - 한 행에서 열을 바꾸는 반복문
            for(int col=1;col<=row;col++){
                //반복문 3 - 한 열 안에서 자리수를 맞추는 반반복문
                for(int i=String.valueOf(number).length();i<length;i++){
                    //공백인쇄
                    line += " ";
                }
                //실제 인쇄될 수를 문자열에 더하고 한 칸 띄우기
                line += (number + " ");

                number++;
            }
            //출력
            System.out.println(line);
        }
}}
