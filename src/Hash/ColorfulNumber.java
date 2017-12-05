package Hash;
import java.util.ArrayList;

public class ColorfulNumber {
	public int colorful(int a) {
	    int colorful = 1;
	    List<String> allNos = new ArrayList<String>();
	    HashSet<Integer> allProducts = new HashSet<Integer>();

	    String input = a+"";
	    for(int i=0; i<input.length(); i++) {
	        for(int j=i+1; j<input.length()+1; j++) {
                    allNos.add(input.substring(i,j));
            }
	    }
	    
	    for(String s : allNos) {
	        int sum = 1 ;
	       // System.out.println(s);
	        for(char c : s.toCharArray()) {
	            sum *= Character.getNumericValue(c);
	        }
	        if(allProducts.contains(sum)) {
	            colorful = 0;
	            return colorful;
	        }
	        else {
	            allProducts.add(sum);
	        }
	    }
	    return colorful;
	}
}
