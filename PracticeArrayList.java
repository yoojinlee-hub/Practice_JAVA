import java.util.ArrayList;

public class PracticeArrayList {

        public static void main(String[] args){
            String[] nameArray = new String[5];
            nameArray[0] = "강유진";
            nameArray[2] = "김유진";
            nameArray[3] = "서유진";
            nameArray[4] = "문유진";

            for(String name : nameArray){
                System.out.println(name);
            }

            //ArrayList
            ArrayList<String> nameList = new ArrayList<>();
            nameList.add("김유진");
            nameList.add("강유진");
            nameList.add("이유진");
            nameList.add("최유진");
            nameList.add("박유진");
            nameList.add("문유진");
            nameList.add("권유진");
            nameList.add("서유진");
            nameList.add("성유진");

            nameList.remove(3);

            System.out.println(nameList.size()); //1
            System.out.println(nameList.get(0)); //김유진
            System.out.println(nameList);

            //ArrayList2 //<>기본형을 넣을 수 없음
            ArrayList<Integer> numList = new ArrayList<>();

            numList.add(1);
            numList.add(2);
            numList.add(3);
            numList.add(4);
            numList.add(5);

            for(int num:numList){
                System.out.println(num*num);
            }
        }
    }


