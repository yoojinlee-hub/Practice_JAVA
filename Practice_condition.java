import java.util.Scanner;
public class Practice_condition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mbti;
		String answer="";
		int wrong=0;
		
		System.out.println("===== ������ MBTI ��� ���� =====");
		System.out.print("����� MBTI�� �Է��ϼ���:");
		mbti=sc.next();
		
		switch(mbti) {
			case "INTP":case "intp": answer="��ص�"; break;
			case "ENFJ":case "enfj": answer="����Ʈ�ص�"; break;
			case "INFJ":case "infj": answer="Ǯ����"; break;
			case "ISTJ":case "istj": answer="�ۺ���"; break;
			case "INTJ":case "intj": answer="�����ͺм���"; break;
			case "ENFP":case "enfp": answer="AI"; break;
			case "ENTP":case "entp": answer="iOS"; break;
			case "ESFJ":case "esfj": answer="���� ������"; break;
			case "ESFP":case "esfp": answer="IoT ����"; break;
			case "ESTJ":case "estj": answer="QA"; break;
			case "INFP":case "infp": answer="���ü��"; break;
			case "ISTP":case "istp": answer="�Ӻ���� ������"; break;
			case "ISFP":case "isfp": answer="��Ʈ��ũ ������"; break;
			default: wrong=1; break;
		}
		
		if(wrong==1) System.out.println("�߸��� mbti�Դϴ�.");
		else System.out.printf("����� %s�� �Դϴ�",answer);
		
		sc.close();
	}
}
