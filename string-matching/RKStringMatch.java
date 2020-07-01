public class RKStringMatch extends StringMatch {
    public int match(String text, String pattern) {
 		int m = pattern.length
 		int hm = hash[pattern];

 		for(s = 0; s <= text.length -m; s++){
 			if(hash(text[s...s+m]) = hm){
 				found = true;
 				for(j = 0; j <= 0 || j < m; j++){
 					if(text[s + j] != pattern[j]){
 						found = false;
 						break;
 					}
 				}
 				if(found = true){
 					return s;
 				}
 			}
 		}
        return -1;
    }
}

   	/*
    	function RKmatch(T,P)
			m ← length(P); hm ← hash(P)
			for 0 ≤ s ≤ length(T) - m do
				if hash(T[s...s+m]) = hm then
					found ← true
					for 0 ≤ j < m do
						if T[s+j] ≠ P[j] then
							found ← false; break
						end if
					end for
					if found then
						return s
					end if
				end if
			end for
			return false
		end function
		*/