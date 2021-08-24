public class ObjectClass2 extends Object{
    public final String firstName;
    public final String lastName;

    public ObjectClass2(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName;
    }
}
