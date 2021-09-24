import java.util.Arrays;

public class Assignment4_4 {

	public static void main(String[] args) {
		double[] nums = { 1.0, 2.0, 3.0, 4.0 };
		double max = nums[0];
		double sum=0.0;
		
		System.out.print("toString()로 출력:");
		System.out.print(Arrays.toString(nums)+"\n");
		
		for(double value : nums) {
			System.out.print(value + "  ");
			sum = sum + value;
			
			if(max<=value)
				max=value;
		}
		
		System.out.println();
		System.out.println("합은 "+ sum);
		System.out.println("최대값은 "+ max);
	}

}
