import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

class Heap {
    // public for JUnit testing purposes
    public ArrayList<Integer> array;
    public int heap_size;

    public int start;
    public int max;
    public int current;
    public int s;

    public Heap(int size) {
    }
    public Heap(List<Integer> source) {
        this(source, false);
    }
    public Heap(List<Integer> source, boolean incremental) {
    }

    public static int parent(int index) {
        int x = (int)Math.floor((index - 1) / 2);
        return x;
    }
    public static int left(int index) {
        return 2 * (index + 1);
    }
    public static int right(int index) {
        return 2 * (index + 2);
    }
    
    public void maxHeapify(int i) {
                /*
        function MAX-HEAPIFY(heap,root)
            left<-LEFT(root)
            right<-RIGHT(root)
            largest<-root
            if(left<heap.heapsize ^ heap[left]>heap[largest])
                largest<-left
            end if
            if(right<heap.heapsize ^ heap[right]>heap[largest])
                largest<-right
            end if
            if(largest ≠ root)
                SWAP(heap[largest],heap[root])
                MAX-HEAPIFY(heap,largest)
            end if
        end function
        */
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
    /*
    function BUILD-MAX-HEAP(A)
        A.heapsize <- A.length
        for FLOOR(A.length/2) < j ≤ 0
            MAX-HEAPIFY(A,j)
        end for
    end function
    */
        heap_size = array.size();
        for (int i = (int) Math.floor(heap_size / 2); 0 <= i; i--){
            maxHeapify(i);
        }
    }

    public void insert(Integer k) {
        /*
        function INSERT(key)
        pos <- heap.size
        heap[pos] <- k
        heap.size <- heap.size + 1
        while(pos > 0 ^ heap[parent(pos)] < heap[pos])
            SWAP(heap[parent(pos)], heap[pos])
            pos <- parent(pos)
        end while
        end function
        */
        s = heap_size;
        array.add(k);
        heap_size = heap_size + 1;
        while(s > 0 && array.get(parent(s)) < array.get(s)) {
            swap(parent(s), s);
            s = parent(s);
        }
    }

    public Integer maximum() {
        int max = array.get(0);
        for (int i =0; i < array.size(); i++) {
            if(max < array.get(i)) {
                max = array.get(i);
            }
        }
        return max;
    }

    public Integer extractMax() {
        /*
        max <- heap[0]
        heap[0] <- heap[heap.size-1]
        heap.size <- heap.size-1
        MAX-HEAPIFY(heap,0)
        return max
        */
        int max = array.get(0);
        array.set(0,array.get(heap_size - 1));
        heap_size =- 1;
        maxHeapify(0);
        return max;
    }

    public void swap(int i, int y){
        int tmp = array.get(i);
        array.set(i, array.get(y));
        array.set(y, tmp);
    }

    public ArrayList<Integer> sort(){
        /*
        function heapsort(array)
            build-max-heap(array)
                while array.heapsize > 0 do
                    i = array.heapsize
                    array[i] = extract-max!(array)
                end while
            return array
        end function
        */
        buildMaxHeap();
        while (heap_size >1) {
            int sorted = heap_size-1;
            array.set(sorted, extractMax());
            
        }
        return array;
    }
}