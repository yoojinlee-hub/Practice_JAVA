import java.util.*;
public class Assignment11_3Test {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		Scanner input = new Scanner(System.in);
		int i=0,n;
		String name,num;
		
		System.out.print("�Է��Ϸ��� �������� ���� : ");
		n = input.nextInt();
		
		System.out.println("�̸��� ��ȭ��ȣ�� �Է��ϼ���. (��: ȫ�浿 010-111-1212)");
		while(i<n) {
			System.out.print((i+1)+". �̸�, ��ȭ��ȣ >>");
			name = input.next();
			num = input.next();
			map.put(name,num);
			i+=1;
		}
		
		//find
		int find=0;
		System.out.print("��ȭ��ȣ�� ã������ ȸ���� �̸���:");
		String findName = input.next();

		Iterator<String> toFind = map.keySet().iterator();
		while (toFind.hasNext()) {
			String key = toFind.next();
			String value = map.get(key);
			if(key.equals(findName)) {
				System.out.println(key+"�� ��ȭ��ȣ��"+value);
				find=1;
				break;
			}
		}
		if(find==0)
			System.out.println("�ش��ϴ� �̸��� ȸ���� ����Ʈ�� �����ϴ�");
	}

}
