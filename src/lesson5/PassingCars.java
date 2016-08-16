package lesson5;
import java.util.Arrays;

/////// L5_PassingCars - 100% /////

// Count the number of passing cars on the road.

public class PassingCars {
	
	public static void main(String[] args) {
		int[] pass = {0,1,0,1,0};
		System.out.println(solution(pass));
	}
	
	public static int solution(int[] A) {
		int pairsOfPassing = 0;
		int lengthA = A.length;
		int[] prefixSum = new int [lengthA+1];
		
		
		for(int i=0; i<lengthA; i++) {
			prefixSum[i+1] = prefixSum[i] + A[i];
			System.out.println(Arrays.toString(prefixSum));
		}
		
		for(int i=0; i<lengthA; i++) {
			if(A[i]==0) {
				pairsOfPassing += (prefixSum[lengthA]-prefixSum[i]);
			}
		}
		if (pairsOfPassing>1000000000 || pairsOfPassing<-1000000000) pairsOfPassing = -1;
		return pairsOfPassing;
	}

}
