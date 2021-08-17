public class trycatch_Exception_Handling {
    public static void main(String[] args){
        int[] smallArray = new int[3];

        //오류
       // for(int i=0;i<10;i++){
       //     smallArray[i]=i;
      //  }

        //결과 확인 - 오류
       // for(int i: smallArray){
      //      System.out.println(i);
      //  }

        for(int i=0;i<10;i++){
            try{
                smallArray[i]=i;
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println(i +"번 째 시도에서 예외 발생");
            }
        }

        //결과확인
        for(int i: smallArray){
            System.out.println(i);
        }
    }
}
