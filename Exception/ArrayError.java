import java.util.*;

public class ArrayError {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5};
		int i=0;
		
		try {
			for(i=0;i<=array.length;i++)
				System.out.print(array[i]+" ");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스"+i+"는 사용할 수 없네요");
		}finally {
			System.out.println("try-catch 구문 실행");
		}
	}

}
