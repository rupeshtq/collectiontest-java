package TestonHashmap;

import java.util.Arrays;

public class Q12Duplicate {
		public static void main(String[] args) {
			int[] arr1 = { 2, 3, 4, 6, 12, 35 };
			int[] arr2 = { 1, 2, 3, 5, 12, 14, 45 };
			int[] arr3 = new int[arr1.length + arr2.length];
			int c = 0;
			for (int i = 0; i < arr3.length; i++) {
				if (arr1.length <= i) {
					arr3[i] = arr2[c];
					c++;
				} else
					arr3[i] = arr1[i];
			}

			Arrays.sort(arr3);
			int n = 1;
			for (int i = 1; i < arr3.length; i++) {
				if (arr3[i] != arr3[i - 1])
					n++;
			}
			int[] a = new int[n];
			a[0] = arr3[0];
			n = 1;
			for (int i = 1; i < arr3.length; i++) {
				if (arr3[i] != arr3[i - 1])
					a[n++] = arr3[i];
			}

			System.out.println(Arrays.toString(a));

		}
	}

