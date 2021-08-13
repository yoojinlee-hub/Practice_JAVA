public class Person1 {
    private String name;

    public Person1(String pName) {
        name = pName;
    }

    public void sayHello() {
        System.out.println("Hi. My name is " + this.name);
    }
}
