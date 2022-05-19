import java.util.*;

public class Assignment11_1Test {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		Scanner input = new Scanner(System.in);
		String cnt="";

		map.put("java", "자바");
		map.put("school", "학교");
		map.put("map", "지도");

		// keySet().iterator()
		Iterator<String> iteratorK = map.keySet().iterator();
		System.out.println("*** keySet() ***");

		while (iteratorK.hasNext()) {
			String key = iteratorK.next();
			String value = map.get(key);
			System.out.println("단어 : " + key + ", 의미:" + value);
		}

		// entrySet().iterator()
		Iterator<Map.Entry<String, String>> iteratorE = map.entrySet().iterator();
		System.out.println("*** entrySet() ***");

		
		while (iteratorE.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iteratorE.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("(" + key + "," + value+")");
		}

		
		System.out.println();
		System.out.println();
		
		while(true) {
			int find=0;
			System.out.print("찾고 싶은 단어:");
			cnt = input.next();

			if(cnt.equals("quit")) {
				System.out.println("프로그램 종료");
				break;
			}

			Iterator<String> toFind = map.keySet().iterator();
			while (toFind.hasNext()) {
				String key = toFind.next();
				String value = map.get(key);
				if(key.equals(cnt)) {
					System.out.println("단어의 의미는 "+value);
					find=1;
					break;
				}
			}
			if(find==0)
				System.out.println("찾는 단어가 없습니다.");

		}
	}

}
