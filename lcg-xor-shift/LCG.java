public class LCG {

	long int_a, int_c, int_m, int_seed;

    public LCG(long _a, long _c, long _m, long seed) { 

    	_a = 1664525;
    	_c = 1013904223l;
    	_m = 4294967296l;
    	int_a = _a;
    	int_c = _c;
    	int_m = _m;
    	int_seed = seed;

    }

    public long next() {
        return int_seed = (int_seed * int_a + int_c) % int_m;
    }

    public void seed(long seed) { 

    	int_seed = seed;

    }
}
