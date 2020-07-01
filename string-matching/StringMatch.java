public abstract class StringMatch {
    public OpCounter counter = new OpCounter();
    public abstract int match(String text, String pattern);

    int m = pattern.length;
    boolean found = false;

    for(s = 0; s <= text.length - m; s++){
    	if(text[s...s+m] == pattern[0...m]){
    		return s;
    	}
    }
    return false;
}

   /*
	function match(T,P)
		m ← length(P)
		for 0 ≤ s ≤ length(T) - m do
			if T[s...s+m] = P[0...m] then
				return s
			end if
		end for
		return false
	end function
	*/