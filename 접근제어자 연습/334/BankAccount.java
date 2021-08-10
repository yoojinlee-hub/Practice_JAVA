public class BankAccount {
    private int balance;
    private Person owner;
    
    public void setBalance(int pBalance) {
        if(pBalance >= 0) {
        balance = pBalance;
        }
    }
    public int getBalance() {
        return balance;
    }
    
    public void setOwner(Person pOwner) {
        owner = pOwner;
    }
    public Person getOwner() {
        return owner;
    }
    
    
    boolean deposit(int amount) {
        if ( amount < 0 || owner.getCashAmount() < amount ) {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            System.out.println("false");
            return false;
        } else {
            balance = balance + amount;
            owner.setCashAmount(owner.getCashAmount() - amount);
            System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            System.out.println("true");
            return true; 
            
        }
                               }
    boolean withdraw(int amount) {
        if ( amount < 0 || balance < amount ) {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            System.out.println("false");
            return false;
        } else {
            balance = balance - amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            System.out.println("true");
            return true;
                               }
                               }


}