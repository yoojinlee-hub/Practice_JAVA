public class Person {
    private String name;
    private int age; //접근제어자
    private int cashAmount;
    private BankAccount account;

    public void setAge(int newAge){
        if (newAge>=0) {
            age = newAge;
        }
    }
    public int getAge(){
            return age;
        }

    public void setName(String newName){
            name = newName;
        }
    public String getName(){
        return name;
    }
     public void setCashAmount(int newCashAmount){
            if(newCashAmount>=0){
                cashAmount = newCashAmount;
            }
        }
     public int getCashAmount(){
            return cashAmount;
        }
}
