public class NaiveStringMatch extends StringMatch {
    public int match(String text, String pattern) {
    	
    boolean found = false;
    int m = pattern.length;

    for(s = 0; s <= text.length; s++) - m{
    	found = true;
    	for(int j = 0; j < match; j++){
    		if(text[s + j] != pattern[j]){
    			found = false;
    			break;
    		}
    	}
    	if(found = true){
    		return s;
    	}
    }
    return false;
}
}

    /*
    function match(T,P)
		m ← length(P)
		for 0 ≤ s ≤ length(T) - m do
			found ← true
			for 0 ≤ j < m do
				if T[s+j] ≠ P[j] then
					found ← false; break
				end if
			end for
			if found then
				return s
			end if
		end for
		return false
	end function
    */