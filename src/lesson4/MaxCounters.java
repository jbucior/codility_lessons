package lesson4;
import java.util.Arrays;

//////L4_MaxCounters - 100% correctness, 80% performance /////////

// Calculate the values of counters after applying all alternating operations: increase counter by 1; set value of all counters to current maximum.

//TODO przyspieszyc - limit 8.38s, u mnie ~14s
//Z³o¿onoœæ OK - O(N*M)

public class MaxCounters {
	
	public static void main(String[] args) {
		int[] C = {1,1,2};
		int N = 2;
		System.out.println("Wynik: " + Arrays.toString(solution(N, C)));
	}
	
	public static int[] solution(int N, int[] A) {
		int[] solution = new int[N]; // array of N counters
		int length = A.length;
		int max_counter = 0;
		int temp = 0;
		
		for(int i=0; i<length; i++) {
			temp = A[i];
			if (temp>=1 && temp<=N) {
				solution[temp-1]++; // increase counter on position A[i-1]
				if(solution[temp-1]>max_counter) {
					max_counter=solution[temp-1];  // setting max counter on that moment
				}
			} else {  // setting all counters to max counter value when A[i]>N
				for(int g=0; g<N; g++) {
					solution[g] = max_counter;
				}			
			}
			System.out.println(Arrays.toString(solution));
		}
		
		return solution;
	}
}
