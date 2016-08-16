package lesson3;

//////// L3_TapeEquilibrium - 100% ///////

// Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.

public class TapeEquilibrium {
	
	public static void main(String[] args) {
		int[] B = {-1000, 1000, -1000};	
		System.out.println(solution(B));
	}

	public static int solution(int[] A){
		int minDif = 0;
		int sumLeftSideOfArray = 0;
		int sumRightSideOfArray = 0;
		
		if(A.length>0){
			sumLeftSideOfArray = A[0];
			
			for (int i=1; i<A.length; i++){
				sumRightSideOfArray += A[i];
			}
			
			minDif = Math.abs(sumLeftSideOfArray - sumRightSideOfArray);
			
			for (int i=1; i<A.length-1; i++){
				sumLeftSideOfArray += A[i];
				sumRightSideOfArray -= A[i];
				int dif = Math.abs(sumLeftSideOfArray - sumRightSideOfArray);
				if (dif<minDif) {
					minDif = dif;
				}
			}	
		}
		return minDif;
	}
}
