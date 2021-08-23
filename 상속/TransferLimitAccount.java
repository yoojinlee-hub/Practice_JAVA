public class TransferLimitAccount extends bankaccount2{
    private int transferLimit;

    public TransferLimitAccount(int balance, int transferLimit){
        super(balance);
        this.transferLimit = transferLimit;
    }

    @Override
    public boolean withdraw(int amount){
        if(amount > transferLimit){
            return false;
        }
        return super.withdraw(amount); //나머지는 부모클래스의 메소드를 그대로 쓰고 싶을 때
    }

}
