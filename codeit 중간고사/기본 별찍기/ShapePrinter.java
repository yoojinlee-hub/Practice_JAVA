public class ShapePrinter {
    public void printTriangle(int height) {
        // 코드를 입력하세요.
        int i,j;
        for(i=1;i<=height;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}