import java.util.ArrayList;

public class Main {
    public static int getSurvivingIndex(int n, int k) {
        // 솔저 생성
       ArrayList<Integer> soldiers = new ArrayList<>();
       for (int i = 1; i <= n; i++) {
           soldiers.add(i);
       }
        // 시체 보관소
       ArrayList<Integer> corpse_list = new ArrayList<>();
       // 최후의 한명이 남는 순간까지 게임을 반복한다
       while (n >= 2) {
           for (int i = 1; i <= k - 1; i++) {
               soldiers.add(soldiers.get(0));
               soldiers.remove(0);
           }
           corpse_list.add(soldiers.get(0));
           soldiers.remove(0);
           n--;
       }
       // 시체 나열
       for (Integer corpse : corpse_list) {
           System.out.println(corpse + "번 군사가 죽습니다. ");
       }

       // 최후의 1인
       return soldiers.get(0);
   
    }

    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
}