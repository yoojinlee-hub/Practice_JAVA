public class SavingAccount extends bankaccount2{ //상속
    private double interest;

    public void setInterest(int interest){
        this.interest= interest;
    }
    public double getInterest(){
        return interest;
    }
    public void addInterest(){
        //balance = (int)(balance*(1+interest));
        setBalance((int)(getBalance()*(1+interest)));
    }

}
