import java.util.Arrays;

public class Assignment4_4 {

	public static void main(String[] args) {
		double[] nums = { 1.0, 2.0, 3.0, 4.0 };
		double max = nums[0];
		double sum=0.0;
		
		System.out.print("toString()�� ���:");
		System.out.print(Arrays.toString(nums)+"\n");
		
		for(double value : nums) {
			System.out.print(value + "  ");
			sum = sum + value;
			
			if(max<=value)
				max=value;
		}
		
		System.out.println();
		System.out.println("���� "+ sum);
		System.out.println("�ִ밪�� "+ max);
	}

}
