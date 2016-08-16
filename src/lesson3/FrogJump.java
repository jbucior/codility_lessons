package lesson3;

///////// L3_FrogJump - 100% //////////

// Count minimal number of jumps from position X to Y.

public class FrogJump {
	
	public static void main(String[] args) {

		System.out.println(solution2(39,100,30));
	}

	// not very wise method
	public static int solution(int X, int Y, int D) {

		double XX = X;
		double YY = Y;
		double DD = D;
		
		int jumps = (int) Math.ceil((YY-XX) / DD) ;
		
		return jumps;
	}
	
	//better way
	public static int solution2(int X, int Y, int D) {
		
		int jumps = ((Y-X) / D);
		//System.out.println(jumps);
		jumps += ((Y-X)%D!=0) ? 1: 0;
		
		return jumps;
	}
	

}
