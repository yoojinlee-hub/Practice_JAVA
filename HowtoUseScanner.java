import java.util.Scanner;
public class HowtoUseScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======== �ڱ�Ұ� �Է��ϱ� =========");
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.next();
		System.out.print("���̸� �Է��ϼ���: ");
		int old = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ���: ");
		float height = sc.nextFloat();
		System.out.print("�������� �Է��ϼ���: ");
		String ABO = sc.next();
		System.out.print("MBTI�� �Է��ϼ���: ");
		String mbti = sc.next();
		System.out.print("�¿�� �� ������ �Է��ϼ���: ");
		sc.nextLine();
		String sentence = sc.nextLine();
		System.out.println("======== �ڱ�Ұ� �Է� �Ϸ� =========");
		
		System.out.println("���̿� �׶��� �ڱ�Ұ� ����! => �����Ϸ��� ���͸� ��������.");
		sc.nextLine();
		System.out.printf("���� %s�Դϴ�. ���̴� %d�̰�, Ű�� %f�Դϴ�.\n �������� %s�� �̰�, mbti�� %s�Դϴ�. \n���� �¿���� '%s'�Դϴ�.", name,old,height,ABO,mbti,sentence);

		sc.close();
	}

}
