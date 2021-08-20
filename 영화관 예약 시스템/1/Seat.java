public class Seat {
    private String name;
    public String getName(){
        return name;
    }
    public void reserve(String name){
        this.name = name;
        //return name;
    }
    public void cancel(){
        name=null;
        //return name;
    }
    public boolean isOccupied(){
        if(name!=null){
            return false;
        }else{
            return true;
        }
    }
    public boolean match(String checkName){
        return name.equals(checkName);
    }

}