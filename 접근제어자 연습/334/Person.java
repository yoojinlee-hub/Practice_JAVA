public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;
    
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
}