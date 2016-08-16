package lesson3;
import java.util.Arrays;

///////// L3_PermMissingElem - 100% ///////

// Find the missing element in a given permutation

public class PermMissingElem {
	
	public static void main(String[] args) {
		
		int[] A = {1, 7, 6, 2, 3, 4, 1};
		System.out.println(solution(A));
	}
	

	public static int solution(int[] A){
		int missing = 1;
		boolean flag = false;
		
		Arrays.sort(A);
		
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		
		
		if (A.length==1 && A[0]==1) missing = 2;
		
		if (A.length>1 && A[0]==1) {
			for (int i=0; i<A.length-1; i++){
				if (A[i]+1 != A[i+1]) {
					missing = A[i]+1;
					flag = true;
				} 
			}
			if (flag==false) missing = A[A.length-1]+1;
		
		}
		return missing;
	}
}
