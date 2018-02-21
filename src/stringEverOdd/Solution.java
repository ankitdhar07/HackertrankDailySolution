package stringEverOdd;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		char[] charStream = null;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int j = 1; j <= n; j++) {
			String s = sc.nextLine();
			charStream = s.toCharArray();

			for (int i = 0; i < charStream.length; i++) {
				if (i % 2 == 0) {
					System.out.print(charStream[i]);
				}

			}
			System.out.print(" ");

			for (int i = 0; i < charStream.length; i++) {
				if (i % 2 != 0) {
					System.out.print(charStream[i]);
				}

			}
			System.out.println();

		}

	}
}
