import java.io.*;
public class Assignment13_1Test {

	public static void main(String[] args) throws IOException {
		try(
				FileReader in = new FileReader("D:\\��������\\4-1\\��ü���⼳��\\Week12\\Assignment13_1\\src\\in.txt");
				FileWriter out = new FileWriter("D:\\��������\\4-1\\��ü���⼳��\\Week12\\Assignment13_1\\src\\out.txt");){

			int b;
			while( (b = in.read()) != -1) {
				if(b >=97 && b<=122){  //�ҹ��ڰ� ���ԵǾ� ������
					b = b-32;     //�빮�ڷ� ����(�ƽ�Ű�ڵ�)
				}
				out.write((char)b);	
			}


		}

	}

}
