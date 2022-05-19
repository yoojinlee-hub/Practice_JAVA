import java.util.*;
public class Assignment11_3Test {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		Scanner input = new Scanner(System.in);
		int i=0,n;
		String name,num;
		
		System.out.print("입력하려는 데이터의 수는 : ");
		n = input.nextInt();
		
		System.out.println("이름과 전화번호를 입력하세요. (예: 홍길동 010-111-1212)");
		while(i<n) {
			System.out.print((i+1)+". 이름, 전화번호 >>");
			name = input.next();
			num = input.next();
			map.put(name,num);
			i+=1;
		}
		
		//find
		int find=0;
		System.out.print("전화번호를 찾으려는 회원의 이름은:");
		String findName = input.next();

		Iterator<String> toFind = map.keySet().iterator();
		while (toFind.hasNext()) {
			String key = toFind.next();
			String value = map.get(key);
			if(key.equals(findName)) {
				System.out.println(key+"의 전화번호는"+value);
				find=1;
				break;
			}
		}
		if(find==0)
			System.out.println("해당하는 이름의 회원은 리스트에 없습니다");
	}

}
