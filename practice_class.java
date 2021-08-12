public class practice_class { //객체의 설계도 main 메소드 BankDriver
    public static void main(String[] args) {
        //사람2
//        Person p2 = new Person();
//        p2.setAge(26);
//        p2.setName("김유진");
//        p2.setCashAmount(100000);

       // Person p2 = new Person("김유진",28,100000);

      //  Person p3 = new Person("나유진",25);
//        System.out.println(p3.getName());
//        System.out.println(p3.getCashAmount());
        // 3 - 4. write code here
    //    BankAccount a2 = new BankAccount();
//        a2.setBalance(500000);
//
//        p2.setAccount(a2);
//        a2.setOwner(p2);
//
//        a2.deposit(30000);
//        a2.withdraw(170000);
//        a2.deposit(620000);
//        a2.withdraw(890000);

        Person p1 = new Person("김신의", 28);
        p1.setCashAmount(30000);
        Person p2 = new Person("문종모",25,100000);

        BankAccount a1 = new BankAccount(p1);
        a1.setBalance(100000);
        p1.setAccount(a1);//이거 조심!
        BankAccount a2 = new BankAccount(500000, p2);
        p2.setAccount(a2); //이거 조심!

        a2.deposit(30000);
        a2.withdraw(170000);
        a2.deposit(620000);
        a2.withdraw(890000);

        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);
    }
}
