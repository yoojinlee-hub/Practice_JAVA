public class MarketGood_final {
    public final String name; //제품명
    public final int retailPrice; //정가
    private int discountRate;

    public MarketGood_final(String name, int retailPrice, int discountRate){
        this.name = name;
        this.retailPrice = retailPrice;
        if (discountRate < 0 || discountRate > 100 ){
            this.discountRate = 0;
        }else{
            this.discountRate = discountRate;
        }
    }
    public MarketGood_final(String name, int retailPrice){
        this(name,retailPrice,0);
    }
    public void setDiscountRate(int discountRate){
        this.discountRate=discountRate;
    }
    public int getDiscountRate(){
        return discountRate;
    }

    public int getDiscountedPrice(){
        return (int)(retailPrice*((100-discountRate)*0.01));
        //return (int) (retailPrice * (1 - discountRate / 100.0));
    }
}

