import java.util.Scanner;
public class Practice_condition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mbti;
		String answer="";
		int wrong=0;
		
		System.out.println("===== 개발자 MBTI 결과 보기 =====");
		System.out.print("당신의 MBTI를 입력하세요:");
		mbti=sc.next();
		
		switch(mbti) {
			case "INTP":case "intp": answer="백앤드"; break;
			case "ENFJ":case "enfj": answer="프론트앤드"; break;
			case "INFJ":case "infj": answer="풀스택"; break;
			case "ISTJ":case "istj": answer="퍼블리셔"; break;
			case "INTJ":case "intj": answer="데이터분석가"; break;
			case "ENFP":case "enfp": answer="AI"; break;
			case "ENTP":case "entp": answer="iOS"; break;
			case "ESFJ":case "esfj": answer="게임 개발자"; break;
			case "ESFP":case "esfp": answer="IoT 개발"; break;
			case "ESTJ":case "estj": answer="QA"; break;
			case "INFP":case "infp": answer="블록체인"; break;
			case "ISTP":case "istp": answer="임베디드 개발자"; break;
			case "ISFP":case "isfp": answer="네트워크 개발자"; break;
			default: wrong=1; break;
		}
		
		if(wrong==1) System.out.println("잘못된 mbti입니다.");
		else System.out.printf("당신은 %s형 입니다",answer);
		
		sc.close();
	}
}
