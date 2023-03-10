package week1.Day2;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		int arrayset[] = {14,12,13,11,15,14,18,16,17,19,18,17,20};

		int len = arrayset.length;
		Arrays.sort(arrayset);
		System.out.println("The duplicate values are ");
		
		for (int i = 0; i < len-1; i++) {
			if (arrayset[i]==arrayset[i+1]) {
				System.out.println(arrayset[i]);
			}
		}
	}

}
