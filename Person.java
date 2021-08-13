public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public Person(String name,int age){
        this(name, age, 0);
        if(age<0){
            this.age = 12;
        }else{
            this.age = age;
        }
    }
    public Person(String name,int age, int cashAmount){
        this.name = name;
        if(age<0){
            this.age = 12;
        }else{
            this.age = age;
        }
        if(cashAmount<0){
            this.cashAmount = 0;
        }else{
            this.cashAmount = cashAmount;
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age >= 0) {
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }

    public void setCashAmount(int cashAmount) {
        if(cashAmount >= 0) {
            this.cashAmount = cashAmount;
        }
    }
    public int getCashAmount(){
        return cashAmount;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }
    public BankAccount getAccount() {
        return account;
    }



    // account와 account 간의 거래이므로, 첫째로 BankAccount 클래스의 transfer 메소드를 써야함.
    // 둘째로 Person to의 정보를 to의 account 정보로 바꾸어 호출.
    public boolean transfer(Person to, int amount) {
        return account.transfer(to.getAccount(), amount);
    }

    // account와 account 간의 거래이므로, BankAccount 클래스의 transfer 메소드를 써야함.
    public boolean transfer(BankAccount to, int amount) {
        return account.transfer(to, amount);
    }
}
