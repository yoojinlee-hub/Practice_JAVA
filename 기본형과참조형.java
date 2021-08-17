public class 기본형과참조형 {
    public static void main(String[] args){
        int a = 3;
        System.out.println(a);

        Person p1,p2;
        p1 = new Person("김유진",25);
        p2=p1;

        p2.setName("문유진");
        System.out.println(p1.getName());
        System.out.println(p2.getName());

        int[] aList = new int[3];
        int[] bList = aList;

        aList[0]=1;
        bList[0]=2;

        System.out.println(aList[0]);
        System.out.println(bList[0]);

        Person[] people = new Person[5];
        people[0] = new Person("김신의", 28);
        people[2] = new Person("문종모", 26);
        people[3] = new Person("서혜린", 21);

        for (int i = 0; i < people.length; i++) {
            Person p = people[i];
            if (p != null) {
                System.out.println(p.getName());
            } else {
                System.out.println(i + "번 자리는 비었습니다.");
            }
        }
    }
}
