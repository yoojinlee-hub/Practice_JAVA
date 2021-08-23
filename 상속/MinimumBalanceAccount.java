public class MinimumBalanceAccount extends  bankaccount2{
    private int minimum;

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMinimum() {
        return minimum;
    }

    @Override // 어노테이션(Annotation) : 자식 클래스가 부모 클래스가 가지고 있는 메소드를 덮어쓰고 싶을 때
    public boolean withdraw(int amount) {
        if (getBalance() - amount < minimum) {
            System.out.println("적어도 " + minimum + "원은 남겨야 합니다.");
            return false;
        }

        setBalance(getBalance() - amount);
        return true;
    }
}
