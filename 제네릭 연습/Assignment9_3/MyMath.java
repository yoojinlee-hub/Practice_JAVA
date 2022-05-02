import java.util.List;

public class MyMath<T extends Number> {
	static double average;
	
	public static double getAverage(List<? extends Number> list) {
		double i=0,sum=0;
		for(Number n : list) {
			sum += n.doubleValue();
			i+=1;
		}
		average = sum / i;
		return average;
	}
}
