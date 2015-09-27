package datastructures.arraysandstrings;

public class AtoI {
    
    public static int convertString(String input) {
            int result = 0;
            
            for(int i=0; i<input.length(); i++) {
            	System.out.println(result);
                result = result*10 + input.charAt(i) - '0';
             }
              
            return result;
    }
    
    public static void main(String[] args) {
    	System.out.println(convertString("999") + 1);
    }
    
    
}
        
