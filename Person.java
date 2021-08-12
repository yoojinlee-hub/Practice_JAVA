public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public Person(String pName,int pAge){
        name = pName;
        cashAmount = 0;
        if(pAge<0){
            age = 12;
        }else{
            age = pAge;
        }
    }
    public Person(String pName,int pAge, int pCashAmount){
        name = pName;
        if(pAge<0){
            age = 12;
        }else{
            age = pAge;
        }
        if(pCashAmount<0){
            cashAmount = 0;
        }else{
            cashAmount = pCashAmount;
        }
    }

    public void setName(String pName) {
        name = pName;
    }
    public String getName() {
        return name;
    }

    public void setAge(int pAge) {
        if(pAge >= 0) {
            age = pAge;
        }
    }
    public int getAge() {
        return age;
    }

    public void setCashAmount(int pCashAmount) {
        if(pCashAmount >= 0) {
            cashAmount = pCashAmount;
        }
    }
    public int getCashAmount(){
        return cashAmount;
    }

    public void setAccount(BankAccount pAccount) {
        account = pAccount;
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
