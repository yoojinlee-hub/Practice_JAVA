public class methodoverloading {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        methodoverloading c = new methodoverloading();

        System.out.println(c.add(2, 4));        // test 1
        System.out.println(c.add(2, 4, 8));     // test 2
        System.out.println(c.add(3.14, 2.54));  // test 3
    }
}
