import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	TreeMap<Person,Integer> arr = new TreeMap<>();
        ArrayList<String> s = new ArrayList<>();
    	int max=0; int max_idx=0;
    	for(int i=0;i<3;i++) {
        	String name = sc.next();
        	int age = sc.nextInt();
        	int num = sc.nextInt();
        	Person p = new Person(name,age);
        	if(max<=age) {
        		max=age;
        		max_idx=num;
        	}	
        	arr.put(p, num);
        	s.add(name);
        }
        System.out.println(max_idx);
        String inputName = sc.next();
        
       Iterator it = s.iterator();
       int temp=0;
       while(it.hasNext()) {
    	   if(it.next().equals(inputName)) {
    		   System.out.println("있음");
    		   temp=1;break;
    	   }
       }
       if(temp==0) System.out.println("없음");
    }
}

// 코드 완성
class Person implements Comparable{
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		
		return this.age-p.age;
	}
	
}