public class Box <Phone> {
    private Phone object;

    public void set(Phone object){
        this.object = object;
    }

    public Phone get() {
        return object;
    }

    Box < Phone> box = new Box();
    Phone phone = new Phone();
    box.set(phone);

    Phone unboxed = box.get;

}
