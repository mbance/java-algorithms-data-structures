public class Xorshift {

	long int_a, int_b, int_c, int_seed;

    public Xorshift(long _a, long _b, long _c, long seed) {

    	int_a = _a;
    	int_b = _b;
    	int_c = _c;
    	int_seed = seed;

    }
    
    public long next() {

    	int_seed ^= (int_seed << int_a) % 4294967296L;
    	int_seed ^= (int_seed >> int_b) % 4294967296L;
    	int_seed ^= (int_seed << int_c) % 4294967296L;
        return int_seed;
    }
    
    public void seed(long seed) { 

    	int_seed = seed;

    }
}
