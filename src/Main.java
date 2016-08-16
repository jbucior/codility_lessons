import java.util.Arrays;

import lesson1.BinaryGap;
import lesson2.CyclicRotation;
import lesson3.FrogJump;
import lesson3.PermMissingElem;
import lesson3.TapeEquilibrium;
import lesson4.FrogRiverOne;
import lesson4.MaxCounters;
import lesson5.CountDiv;
import lesson5.PassingCars;

public class Main {

	public static void main(String[] args) {
		///////// L1_binary_gap - 100% /////////
		System.out.println(Integer.toBinaryString(51712));
		System.out.println(BinaryGap.solution(51712));
		
		//////// L2_cyclic_rotation - 100% //////////
		int[] a = {1,2,3,4};
		int b[] = CyclicRotation.solution(a, 9);
		System.out.println(Arrays.toString(b));
		
		
		///////// L3_FrogJump - 100% //////////
		System.out.println(FrogJump.solution(10,100,30));
		
		///////// L3_PermMissingElem - 100% ///////
		int[] A = {1, 4, 1};
		System.out.println(PermMissingElem.solution(A));
		
		//////// L3_TapeEquilibrium - 100% ///////
		int[] B = {-1000, 1000, -1000};	
		System.out.println(TapeEquilibrium.solution(B));
		
	
		//////// 4.COUNTING ELEMENTS ///////////
		
		////// L4_FrogRiverOne - 100% /////////
		int[] jumps = {1,2,2,2,3};
		int X = 3;
		System.out.println(FrogRiverOne.solution(X, jumps));
		
		
		////// L4_MaxCounters - 88% => 100% correctness, 80% performance /////////
		int[] C = {1,1,2};
		int N = 2;
		System.out.println("Wynik: " + Arrays.toString(MaxCounters.solution(N, C)));
		
		////// 5.PREFIX SUMS ///////
		
		/////// L5_PassingCars - 100% /////
		int[] pass = {0,1,0,1,0};
		System.out.println(PassingCars.solution(pass));
		
		////// L5_CountDiv ////////
		System.out.println(CountDiv.solution2(0, 4, 2));
		
		
		
	}

}
