public class BlackjackCard extends Card{
    public BlackjackCard(int suitNumber,int rankNumber){
        super(suitNumber,rankNumber);
    }//ctrl+N : constructor
    
    public int getValue(){
        //rank를 기준
        //Ace 11
        // J, Q , K 10
        switch(rankNumber){
            case 1:
                return 11;
            case 11:
            case 12:
            case 13:
                return 10;
            default:
                return rankNumber;
        }
    }
    
    public boolean isAce(){
        return rankNumber==1;
    }
}