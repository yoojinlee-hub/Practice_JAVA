public class PhoneBox <T extends Phone> extends Box<T>{
    public void handsFreeCall(String numberString){
        object.call(numberString);
    }
}
