public class Person implements Comparable<Person>{
    public final String name;
    public final int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return name + ": " + age + "세";
    }

    //@Override
    public int compareTo(Person o){
        return name.compareTo(o.name); //알파벳 순서대로
    }
}
