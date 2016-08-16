package lesson7;


public class Brackets {

	public static void main(String[] args) {
		
		String str = "[{()()}]";
		System.out.println(solution(str));
	}
	
	
    public static int solution(String s) {
    	int result = 1;
    	
    	String nestedString = s;
    	
    	for (int i = 0; i < nestedString.length()/2; i++) {
    		
    		
    		int charLeftSide = (int)nestedString.charAt(i);
    		
    		int charRightSide = (int)nestedString.charAt(nestedString.length()-1-i);
    		
    		System.out.println(nestedString.charAt(i)+"   "+nestedString.charAt(nestedString.length()-1-i));
    		
    		System.out.println((int)nestedString.charAt(i)+ "  "+(int)nestedString.charAt(nestedString.length()-1-i));
    		
    		if (charLeftSide != 40 && charLeftSide != 91 && charLeftSide != 123 && charLeftSide != 41 && charLeftSide != 93 && charLeftSide != 125) {
    			System.out.println("zly znak");
    			result = 0;
    			break;
    		}
    		
    		
    		int add = (int)nestedString.charAt(i) == 40 ? 1 : (int)nestedString.charAt(i) == 41 ? 1 : 2;
    		
			if ( charLeftSide != (charRightSide-add) && (charLeftSide-add) != charRightSide) {
				System.out.println("blad");
				result = 0;
				break;
			}
		}
        return result;
    }

}
