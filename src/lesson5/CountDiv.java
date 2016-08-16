package lesson5;

////// L5_CountDiv - 100% ////////

// Compute number of integers divisible by k in range [a..b].

public class CountDiv {
	
	public static void main(String[] args) {
		System.out.println(solution2(0, 4, 2));
	}
	
	// O(n)
	public static int solution(int A, int B, int K) {
		int result = 0;
		
		for(int i=A; i<=B; i++) {
			if (i%K==0){
				result++;
			}
		}
		return result;
	}
	
	// O(1)
	public static int solution2(int A, int B, int K) {
		long dResult = 0;
		int iResult=0;
		long max = (long)B+(long)K;
				
		if (max>=Integer.MAX_VALUE) { // must be checked
			
			dResult = ((long)B+(long)K)/(long)K-((long)A+(long)K-1)/(long)K;
			
			iResult = (int) dResult;
		} else {
			iResult = (B+K)/K-(A+K-1)/K;
		}
		
		return iResult;
	}

}
