package com.hackerrank;

public class PlusMInus {

	public static void main(String[] args) {
		int[] arr = { -4, 3, -9, 0, 4, 1 };
		int total = arr.length;
		int positive = 0;
		int negative = 0;
		int zero = 0;
		double ratio;
		for (int a : arr) {
			if (a > 0) {
				positive++;
			} else if (a < 0) {
				negative++;
			} else {
				zero++;
			}

		}
		ratio = (double) positive / total;
		System.out.format("%.5f", ratio);
		System.out.println();
		ratio = (double) negative / total;
		System.out.format("%.5f", ratio);
		System.out.println();
		ratio = (double) zero / total;
		System.out.format("%.5f", ratio);

	}

}
