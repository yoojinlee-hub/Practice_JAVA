import java.util.Arrays;
import java.util.List;

public class MyMathTest extends MyMath{

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1,2,3,4,5,6);

		System.out.println(arr.toString()+"ÀÇ Æò±Õ:"+getAverage(arr));
	}

}
