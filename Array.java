public class Array {
    public static void main(String[] args){
        int[] intArray = new int[5];

        intArray[0] = 2;
        intArray[1] = 3;
        intArray[2] = 5;
        intArray[3] = 7;
        intArray[4] = 11;

       // System.out.println(intArray[2]+intArray[4]);

        for(int i=0; i < intArray.length ; i++){
            System.out.println(intArray[i]);
        }
    }
}
/*int[] arr1 = {1, 2, 3, 4, 5};
int[] arr2 = arr1; //Alias(가명)
arr1[0] = 100;
System.out.println(arr2[0]);
100
* */
/*int[] arr1 = {1, 2, 3, 4, 5};
int[] arr2 = arr1.clone(); arr1을 통째로 복사

arr1[0] = 100;
System.out.println(arr1[0]);
System.out.println(arr2[0]);
* */
/*for-each
*for (int i : intArray) {
    System.out.println(i);
}
* */