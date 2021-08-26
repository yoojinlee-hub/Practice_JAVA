public class BlackjackHand extends Deck{
    public int getValue(){
        int value = 0;
        int aceCount=0;
        //Ace 
        //value가 21을 넘었을 경우 Ace는 1의 값을 가짐
        //Ace가 몇장? 현재 value?
        for(Card c: getCards()){
            BlackjackCard card = (BlackjackCard) c;
            if(card.isAce()){
                aceCount++;
            }
            value += card.getValue();
        }
        while(aceCount>0&&value>21){
            value-=10;
            aceCount--;
        }
        
        
        return value;
    }
    public boolean isBusted(){
        return getValue()>21;
    }
    public boolean isBlackjack(){
        return getValue()==21&&getCards().size()==2;
    }
}