	/*
	 Problem: 		Insertion Sort,charupaixu
	 Alg/struture:	
	 Idea:			insert into a sorted subarray
	 Example:
	 [3,1,2,8,6,4]
	 [1,3,2,8,6,4]
	 [1,2,3,8,6,4]
	 [1,2,3,6,8,4] 4 swap2次到正确位
	 Time, Space:		O(n^2), O(1)	
    */
	public void insertionSort(int[] a){
		for(int i=1;i<a.length;i++){
			for( int j=i;j>=1;j--){
				if(a[j-1]<=a[j])//in-order
					break;
				swap(a,j-1,j);
			}
		}
	}
	
	public void swap(int[] a, int i, int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp; 
	}
