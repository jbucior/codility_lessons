package lesson6;

import java.util.Arrays;

/////// L6_Triangle - 100% /////

// Determine whether a triangle can be built from a given set of edges.

// a + b > c
// a + c > b
// b + c > a

public class Triangle {

	public static void main(String[] args) {
		
		int[] pieces = {1,10,2,1,2};
		
		System.out.println(solution(pieces));

	}
	
	public static int solution(int[] A) {
		int result = 0;
		
		int[] tab = A;
		
		Arrays.sort(tab);
		
		for (int i = 0; i < tab.length-2; i++) {
			if((long)tab[i]+(long)tab[i+1]>(long)tab[i+2]) {
				result = 1;
			}
		}
		
		return result;
	}

}
