public class AverageFinder {
    double computeAverage(int[] intArray) {
        int i;
        double average;
        // 1. sum이라는 변수에 0의 값을 지정해줍니다.
        int sum = 0;
        // 2. for문을 사용하여 배열의 모든 원소를 sum에 더해줍니다.
        for(i=0;i<intArray.length;i++)
        {
            sum += intArray[i];
        }
        // 3. sum을 배열의 크기로 나누어준 소수형 double의 값을 리턴해줍니다.
        average = (double)sum / intArray.length;
        return average;
    }
}
