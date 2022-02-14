import java.util.Scanner;
public class HowtoUseScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======== 자기소개 입력하기 =========");
		System.out.print("이름를 입력하세요: ");
		String name = sc.next();
		System.out.print("나이를 입력하세요: ");
		int old = sc.nextInt();
		System.out.print("키를 입력하세요: ");
		float height = sc.nextFloat();
		System.out.print("혈액형을 입력하세요: ");
		String ABO = sc.next();
		System.out.print("MBTI을 입력하세요: ");
		String mbti = sc.next();
		System.out.print("좌우명 한 문장을 입력하세요: ");
		sc.nextLine();
		String sentence = sc.nextLine();
		System.out.println("======== 자기소개 입력 완료 =========");
		
		System.out.println("아이엠 그라운드 자기소개 시작! => 시작하려면 엔터를 누르세요.");
		sc.nextLine();
		System.out.printf("저는 %s입니다. 나이는 %d이고, 키는 %f입니다.\n 혈액형은 %s형 이고, mbti는 %s입니다. \n저의 좌우명은 '%s'입니다.", name,old,height,ABO,mbti,sentence);

		sc.close();
	}

}
