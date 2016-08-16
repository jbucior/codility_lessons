package lesson4;
import java.util.Arrays;

//////L4_FrogRiverOne - 100% /////////

// Find the earliest time when a frog can jump to the other side of a river.

public class FrogRiverOne {
	
	// Zapisuj� do nowej tablicy w ktorym kroku pojawila sie dana liczba z wejsciowej tablicy A - dana liczba to indeks w nowej tabeli.
	// Zapisuj� jedynie pierwsze pojawienie si�.
	// Sprawdzam czy jest w tablicy jakies 0, jesli tak to �aba nie przeszla i zwracamy -1.
	// Je�li nie ma �adnego 0 to przesz�a i zwracam najwi�ksz� liczb� z nowej tablicy (najp�znieszy krok).
	
	// eliminuje problem z pojawieniem sie w 0 sekundzie
	
	public static void main(String[] args) {
		int[] jumps = {2,1,2,2,2,3};
		int X = 3;
		System.out.println(solution(X, jumps));
	}
	
	public static int solution(int X, int[] A) {
		int otherSide = 0;
		int[] appearMoments = new int[X+1];

		int first = A[0];
		int zeroCounter=0;

		if(X>1) {
			for(int i=0; i<A.length; i++){
				int temp = A[i];
				
				if(temp>X) {
					break; // niepotrzebne dla zadania z Codility, pozostawione dla dodatkowych test�w - przerywa, gdy pojawia si� liczba wi�ksza od poszukiwanej
				}
				
				if(appearMoments[temp]==0 && temp!=first) { 
					appearMoments[temp] = i;	// zapisuje moment pierwszego pojawienia sie wykluczaj�c nadpisanie elementu pojawiaj�cego si� w sekundzie 0
				}
			}
				
			for(int i=0; i<appearMoments.length; i++){
				if(appearMoments[i]==0) {
					zeroCounter++;
					if(zeroCounter>=3){
						otherSide = -1;
						break;
					}
				} else if (appearMoments[i]>otherSide) {
					otherSide = appearMoments[i];  // przypisanie maksymalnego momentu pojawienia sie elementu
				}
			}
		}
		
		System.out.println(Arrays.toString(appearMoments));
		
		return otherSide;
	}

}
