package lesson8;

import java.util.Arrays;
import java.util.Stack;

/////// L8_Dominator - 100% /////

//Find an index of an array such that its value occurs at more than half of indices in the array


public class Dominator {

	public static void main(String[] args) {
		
		//int[] A = { 1, 1, 5, 3, 1, 1, 1, 2, 4, 2, 1, 1, 5, 6};
		int[] A = {2, 1, 1, 1, 4};
		//int[] A = {};
		System.out.println(solution (A));
	}
	
	
	public static int solution(int[] A) {
		
		int dominatorPosition = -1;	
		
		if (A.length == 0) return dominatorPosition;	
		
		Stack st = new Stack();
		
		for (int i = 0; i < A.length; i++) {
			
			System.out.println("----------");
			
			if(st.empty()) {		
				System.out.println("Pushed: " + st.push(A[i]));	
			} else {
				int peek = (int) st.peek();  // can be packed into if, but .peek must be befor .push
				int pushed = A[i];  			
				System.out.println("Pushed: " + st.push(pushed));
				
				if (peek != pushed) {
					System.out.println("Removed: " + st.pop());
					System.out.println("Removed: " + st.pop());
				}	
			}	
		}

		if(!st.empty()) {  // if empty there is no dominator	
			int wannabeDominator = (int)st.peek();  // the last number is potential dominator
			int counter = 0;
			for (int i = 0; i < A.length; i++) {
				if(A[i] == wannabeDominator) {
					counter++;
					if(counter>A.length/2) {
						dominatorPosition = i;
						break;
					}
				}
			}
		}	
		return dominatorPosition;
	}
	
	


}
