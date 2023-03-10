package week1.Day2;

import java.util.Arrays;

public class MissingElementsInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};

		int len = arr.length;
		Arrays.sort(arr);

		int num = 1;

		for (int i = 0; i < len; i++) { 
			if (arr[i]==num) {
				num++;		
			}
			else {
				System.out.println("The missing value or element in array is " + num);
				break;
			}
		}
	}

}
