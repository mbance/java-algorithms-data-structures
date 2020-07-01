
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;


class Heap {
    // public for JUnit testing purposes
    public ArrayList<Integer> array;
    public int heap_size;

    public int maxi;
    public int pointer;
    public int ind;
    public int start;

    public Heap(int size) {
        this.array = new ArrayList<Integer> (size);
        this.heap_size = 0;
        
    }
    public Heap(List<Integer> source) {
        this(source, false);
    }
    
    
    
    public Heap(List<Integer> source, boolean incremental) {
        this.heap_size = 0;
        if(incremental == true) {
            this.array = new ArrayList<Integer>();
            for(int i = 0; i < source.size(); i++)
                insert(source.get(i));
            }  
            else{
            this.array = new ArrayList<Integer>();
            for(int i = 0; i < source.size(); i++) {
                array.add(source.get(i));
        }
        buildMaxHeap();
        }       
    }
        
    

    

    
    
    
    public static int parent(int index) {
        return (index - 1) / 2;
    }
    public static int left(int index) {
        return 2 * index + 1;
    }
    public static int right(int index) {
        return (2 * index) + 2;
    }
    
    public void maxHeapify(int i) {
        int left = left(i);
        int right = right(i);
        int largest = i;
        if(left < heap_size && array.get(left) > array.get(largest)) {
            largest = left;
        }
        if(right < heap_size && array.get(right) > array.get(largest)) {
            largest = right;
        }
        if(largest != i) {
            swap(i,largest);
            maxHeapify(largest);    
        }

    }
        
    
        
    
    public void buildMaxHeap() {
        heap_size = array.size();
        for (int i = (int)Math.floor(heap_size / 2); 0 <= i ; i--){
            maxHeapify(i);
        }
    
    }
    
    
    public void insert(Integer k) {
        ind = heap_size;
        array.add(k);
        heap_size = heap_size + 1;
        while(ind > 0 && array.get(parent(ind)) < array.get(ind)) {
            swap(parent(ind), ind);
            ind = parent(ind);
        }                
    }
    

    
    private void swap(int i, int y) {
        int temp = array.get(i);
        array.set(i, array.get(y));
        array.set(y, temp);
    }
    public Integer maximum() {
        int maxi = array.get(0);
        for (int i =0; i < array.size(); i++) {
            if(maxi<array.get(i)) {
                maxi = array.get(i);
            }
        }
        return maxi;
        
    }
    public Integer extractMax() {
        maxi = array.get(0);
        array.set(0, array.get(heap_size - 1));
        heap_size = heap_size - 1;
        maxHeapify(0);
        return maxi;
    }
    
    public ArrayList<Integer> sort(){
        buildMaxHeap();
        while (heap_size >1) {
            int sorted = heap_size-1;
            array.set(sorted, extractMax());
            
        }
        return array;
    }
}
