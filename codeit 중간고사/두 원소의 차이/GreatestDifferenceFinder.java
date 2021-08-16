public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        // 코드를 입력하세요.
        int max=0;
        int min=99;
        int i;
        if(intArray.length<2){
            return 0;
        }else{
            for(i=0;i<intArray.length;i++){
                if(max<=intArray[i]){
                    max=intArray[i];
                }
                if (min>=intArray[i]){
                    min=intArray[i];
                }
            }
            return max-min;
        }
    }
}