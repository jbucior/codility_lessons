package lesson2;
import java.util.Arrays;

//////// L2_cyclic_rotation - 100% //////////

// Rotate an array to the right by a given number of steps


public class CyclicRotation {

	public static void main(String[] args) {

		int[] a = {1,2,3,4};
		int b[] = solution(a, 9);
		System.out.println(Arrays.toString(b));
	}
	
	
	public static int[] solution(int[] A, int K){
		
		int[] temp = new int[A.length];
		
		if(A.length!=0) {
			if (K>A.length) K=K-(K/A.length)*A.length; //setting number of transitions for K bigger then array size

			for(int i=0, j=K; i<A.length; i++, j++){
				
				if (j>A.length-1) {
					j=0;				
				}
					temp[j]=A[i];
			}
		}
		return temp;
	}
}
