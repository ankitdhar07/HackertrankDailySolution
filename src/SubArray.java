import java.util.ArrayList;
import java.util.List;

public class SubArray {

	public static void main(String[] args) {
		int[] array = { 1, -2, 4, -5, 1 };
		List<Integer> sum = new ArrayList<>();
		int addVal = 0;
		int negative = 0;

		for (int i = 0; i < array.length; i++) {

			for (int j = i; j < array.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(array[k] + " ");
					
					addVal += array[k];
				}
				System.out.println();
				System.out.println("SubArray sum is : " + addVal);
				sum.add(addVal);
				addVal = 0;
			}
			System.out.println();
		}
		for (int a : sum) {
			if (a < 0) {
				System.out.println("Sum of Subarray :" + a);
				++negative;
			}
		}
		System.out.println(negative);
	}

}
