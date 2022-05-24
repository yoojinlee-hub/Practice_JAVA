import java.io.*;
public class Assignment13_1Test {

	public static void main(String[] args) throws IOException {
		try(
				FileReader in = new FileReader("D:\\동덕여대\\4-1\\객체지향설계\\Week12\\Assignment13_1\\src\\in.txt");
				FileWriter out = new FileWriter("D:\\동덕여대\\4-1\\객체지향설계\\Week12\\Assignment13_1\\src\\out.txt");){

			int b;
			while( (b = in.read()) != -1) {
				if(b >=97 && b<=122){  //소문자가 포함되어 있으면
					b = b-32;     //대문자로 변경(아스키코드)
				}
				out.write((char)b);	
			}


		}

	}

}
