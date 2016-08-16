package lesson1;

///////// L1_binary_gap - 100% /////////

// Find longest sequence of zeros in binary representation of an integer. 


public class BinaryGap {

	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(51712));
		System.out.println(solution(51712));
	}
	
	public static int solution(int n){
		int counter = 0;
		int max = 0;
		String number = Integer.toBinaryString(n);
		
		for(int i=0; i<number.length()-1; i++){
				if(number.charAt(i)==0x30){
					counter++;
					if (counter>max && number.charAt(i+1)==0x31) {		
						max  = counter;
					}
				} else {
					counter = 0;
				}
		}
		return max;
	}
	
	public static int solution2(int n){
		int counter = 0;
		int max = 0;
		String number = Integer.toBinaryString(n);
		
		for(int i=0; i<number.length(); i++){
				if(number.charAt(i)==0x30){
					counter++;
					if (counter>max) {		
						if(i!=number.length()-1 && number.charAt(i)==0x30) {
							
							System.out.println(i + " " + number.charAt(i));
						}
						max  = counter;
					}
				} else {
					counter = 0;
				}
		}
		
		return max;
	}
	
	
}