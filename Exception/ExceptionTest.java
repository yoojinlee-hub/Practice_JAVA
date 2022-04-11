import java.io.*;
public class ExceptionTest {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("test.txt");
		char[] a = new char[50];
		fr.read(a);
		for(char c : a)
			System.out.print(c);
	}

}
