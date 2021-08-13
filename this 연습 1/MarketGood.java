public class MarketGood {
    // 코드를 입력하세요.
    private String name;
    private int retailPrice;
    private int discountRate;

    public MarketGood(String name, int retailPrice, int discountRate){
        this.name = name;
        this.retailPrice = retailPrice;
        if (discountRate < 0 || discountRate > 100 ){
            this.discountRate = 0;
        }else{
            this.discountRate = discountRate;
        }
    }
    public MarketGood(String name, int retailPrice){
        this(name,retailPrice,0);
    }
    public void setDiscountRate(int discountRate){
        this.discountRate=discountRate;
    }
    public int getDiscountRate(){
        return discountRate;
    }
    public String getName(){
        return name;
    }
    public int getRetailPrice(){
        return retailPrice;
    }
    public int getDiscountedPrice(){
        return (int)(retailPrice*((100-discountRate)*0.01));
        //return (int) (retailPrice * (1 - discountRate / 100.0));
    }
}
