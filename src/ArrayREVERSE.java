import java.util.Scanner;

public class ArrayREVERSE {
	public static void main(String[] args) {
        // Get the input
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
      
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }   
        for (int i = array.length - 1; i >= 0; i--) {
        	System.out.print(array[i]+" ");
          
        }
    }
}
