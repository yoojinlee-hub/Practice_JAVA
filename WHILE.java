public class WHILE {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;

        while (i<=3){
            sum = sum+i;
            i = i+1;
        }
        System.out.println(sum);
    }
}
/*int sum = 0, i = 1;

while (sum < 10000) {
    sum += i;
    i++;
}

System.out.println(sum);
System.out.println(i - 1);
* */
/*int sum = 0, i = 1;

while (true) {
    if (sum >= 10000) {
        break;
    }

    sum += i;
    i++;
}

System.out.println(sum);
System.out.println(i - 1);
* */