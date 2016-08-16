package lesson2;
import java.util.Arrays;

//////// L2_odd_occurrences_in_array - 100% //////////

// Find value that occurs in odd number of elements.

public class OddOccurrencesInArray {
	

	public static void main(String[] args) {
		int[] a = {564636, 1, 1, 2, 8, 7, 2, 8, 2, 8, 7, 8, 1,1};
				
		System.out.println(solution(a));
	}
	
	
	public static int solution(int[] A){
		int lonely_number = 0;
		Arrays.sort(A);
		if (A.length<=1) { 
			lonely_number=A[0]; 
		} else {
			for(int i=1; i<A.length; i++){
				if(A[i-1]!=A[i]) {
					if (i!=A.length-1 && A[i]!=A[i+1]) {
						lonely_number = A[i];
					} else if (i==1 && A[i]==A[i+1]) {
						lonely_number = A[i-1];
					} else if (i==A.length-1) {
						lonely_number = A[i];
					}
				}
			} 
		}
		return lonely_number;
	}
}
