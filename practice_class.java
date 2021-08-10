public class practice_class { //객체의 설계도 main 메소드 BankDriver
    public static void main(String[] args){
        // 사람 선언
        Person p1 = new Person();
        //p1.name = "김유진";
        p1.setAge(26);
        p1.cashAmount = 30000;
        // 은행 계좌 생성
        BankAccount a1 = new BankAccount();
        a1.balance = 100000;

        p1.account = a1;
        a1.owner = p1;

        //test
        System.out.println(p1.account.balance);
        System.out.println(a1.owner.name);
        System.out.println(p1.getAge);
    }
}
