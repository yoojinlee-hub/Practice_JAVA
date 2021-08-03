public class Main {
    public static void main(String[] args) {
        // 각 과목 점수
        // 이곳에 코드를 작성하세요.
        int koreanScore = 86 ;
        int mathScore = 94;
        int scienceScore = 87;
        int computerScore = 100;
        // 평균 점수
        double average = (koreanScore+mathScore+scienceScore+computerScore) / (double)4;
        //제대로 하려면 average를 계산할 때 나누는 수 또는 나뉘는 수를 double로 형 변환을 해주어야 합니다
        // 이곳에 코드를 작성하세요.
        System.out.println(average);
    }
}