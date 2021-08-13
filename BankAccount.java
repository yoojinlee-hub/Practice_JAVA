public class BankAccount {
    private int balance;
    private Person owner;

    public BankAccount (int balance){
        if(balance<0){
            balance = 0;
        }else{
            this.balance = balance;
        }
    }
    public BankAccount(Person owner){
        this.owner = owner;
        balance =0;
        owner.setAccount(this);
    }
    public BankAccount(int balance, Person owner) {
        this.owner = owner;
        if(balance<0){
            this.balance = 0;
        }else{
            this.balance = balance;
        }
        owner.setAccount(this);
    }



    public void setBalance(int balance) {
        if(balance >= 0) {
            this.balance = balance;
        }
    }
    public int getBalance() {
        return balance;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
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
    } //파라미터 1개

    public boolean deposit(double amount, double exchangeRate){
        //System.out.println(false);
        return deposit((int)(amount*exchangeRate));
    }//파라미터 2개



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

    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(Person to, int amount) {
        // insert code here
        return transfer(to.getAccount(),amount);
    }

    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {
        // insert code here
        if(amount<0||amount>balance){
            System.out.println(false + " - from: " + owner.getName()
                    + ", to: " + to.getOwner().getName()
                    + ", amount: " + amount
                    + ", balance: " + balance);
            return false;
        }else{
            balance -= amount;
            to.balance +=amount;
            System.out.println(true + " - from: " + owner.getName()
                    + ", to: " + to.getOwner().getName()
                    + ", amount: " + amount
                    + ", balance: " + balance);
            return true;
        }
    }

}
