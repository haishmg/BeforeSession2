package Hash;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    Map<Integer,Integer> exist = new HashMap<Integer,Integer>();
	    for (int i=0; i<a.size(); i++) {
	        if(!exist.containsKey(a.get(i))) {
	            exist.put(a.get(i),0);
	        }
	        else {
	            return a.get(i);
	        }
	    }
	    return -1;
	}
}
