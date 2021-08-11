public class practice_class { //객체의 설계도 main 메소드 BankDriver
    public static void main(String[] args) {
        //사람2
        Person p2 = new Person();
        p2.setAge(26);
        p2.setName("김유진");
        p2.setCashAmount(100000);

        // 3 - 4. write code here
        BankAccount a2 = new BankAccount();
        a2.setBalance(500000);

        p2.setAccount(a2);
        a2.setOwner(p2);

        a2.deposit(30000);
        a2.withdraw(170000);
        a2.deposit(620000);
        a2.withdraw(890000);

    }
}
