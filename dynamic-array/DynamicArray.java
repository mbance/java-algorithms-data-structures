class DynamicArray {
	int items;
	int stored[];
	int newArray[];
	int allSpace;
    public OpCounter counter = new OpCounter();
    
    
    public DynamicArray(int size) {
    	items = 0;
    	allSpace = size;
    	stored = new int[size];
    }
    
    public int length() {
        return items;
    }
    
    public int select(int k) {
        return stored[k];
    }
    
    public void store(int o, int k) {
    	stored[k] = o;
    	counter.add(1);
    }
    
    public void push(int o) {
    	if(items == stored.length)
    	{
    		extend();
    	}
    	
    	stored[items] = o;
    	items++;
    	counter.add(1);
    }
    
    public int pop() {
    	int tempInt = stored[items - 1];
        items--;
        return tempInt;
    }
    
    private void extend() {
    	newArray = new int [stored.length * 2];
    	
    	for(int i = 0; i < items; i++)
    	{
    		newArray[i] = stored[i];
    		counter.add(1);
    	}
    	allSpace = allSpace * allSpace;
    	stored = newArray;
    }
    
    public int newLength() {
    	return allSpace;
    }
}
