public class TypeConversionCasting {
    public static void main(String[] args){
        //숫자형 랭킹 : double, float, long, int, short, byte(-128~127)
        //double x = 3.14;
        //int y = x; //정보를 잃을 수 있어서 불가능

        int x=3;
        double y=x;//아무 문제 없이 형 변환 가능

        double a = 3.14;
        int b = (int) a; //강제형변환

        int ab = 9;
        int bb= 5;
        System.out.println((double)ab / bb);
    }
}
