public class BinarySearch {

	public boolean search(int array[], int key, int lo, int hi) {

		int middle = (lo+hi)/2;

		if(lo == hi){
			return false;
		}

		if(array[middle] == key){
			return true;
		}

		if(key < array[middle]){
			return search(array, key, lo, middle);
		}

		else{
			return search(array, key, middle + 1, hi);
		}
    }


    public int count(int array[], int key, int lo, int hi) {
		
		int count = 0;
		int max = hi-1;
		int middle = (lo+hi)/2;
		int min = lo;
		
		boolean found = false;
		boolean False = false;
		
		while(False != true) {
			
			for(int i = 0; i < array.length; i++) {
				if(array[i] == key) {
					False = true;
					break;
				}
				
			else {
				False = false;
			}
		}
			
			if(False != true){
				
				break;
			}
			}
		
		while (max >= min) {
			middle = (max + min)/2;
			count++;
			if (array[middle] > key) {
				max = middle - 1;
			}
			else if(array[middle] < key) {
				min = middle + 1;
			}
			else if(array[middle] == key) {
				found = true;
				break;
			}
		}
		return count;
	}
}