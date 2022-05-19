import java.util.*;
public class Assignment11_2Test {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		Scanner input = new Scanner(System.in);
		int i=0,max=-100;
		String maxName="";
		
		System.out.println("나라 이름과 인구를 3개 입력하세요. (예: Korea 5000)");
		while(i<3) {
			System.out.print((i+1)+". 나라이름, 인구 >>");
			String name = input.next();
			int num = input.nextInt();
			map.put(name,num);
			i+=1;
		}

		for (String key : map.keySet()) {
			Integer value = map.get(key);
		    if(value>=max) {
		    	max=value;
		    	maxName=key;
		    }
		}
		
		System.out.println("제일 인구가 많은 나라는 ("+maxName+", "+ max+")");
	}

}
