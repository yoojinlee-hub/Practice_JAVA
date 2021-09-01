import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(13);
        integerList.add(7);
        integerList.add(2);
        integerList.add(3);
        integerList.add(11);
        integerList.add(5);
        integerList.add(17);

        Collections.sort(integerList);
        System.out.println(integerList);

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Young");
        stringList.add("Kim");
        stringList.add("Grace");
        stringList.add("Andrew");
        stringList.add("Michael");
        stringList.add("Eugine");

        Collections.sort(stringList);
        System.out.println(stringList);

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Charlie",25));
        personList.add(new Person("Kim",55));
        personList.add(new Person("Eugine",28));
        personList.add(new Person("Alex",18));

         Collections.sort(personList);
    }
}
