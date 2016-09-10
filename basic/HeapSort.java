	/*
	 Problem: 		heap sort,duipaixu
	 Alg/struture:	
	 Idea:			
	 Example:
	 [3,1,2,8,6,4] 2->(4), swap 4,2
	 [3,1,4,8,6,2] 1->(8,6) swap 1,8 
	 [3,8,4,1,6,2] 3->(8,4) swap 3,8 
	 after building heap [8,3,4,1,6,2]
	 [2,3,4,1,6,8] swap 8,2 then maxHeap
	 Time, Space:	O(nlogn), O(1)		
  */
	public void heapSort(int[] a){
		for(int i=a.length/2;i>=0;i--)
			maxHeapify(a,i,a.length);
		for(int i=a.length-1;i>0;i--){
			swap(a,0,i);
			maxHeapify(a,0,i);
		}
	}
	public void maxHeapify(int[] a, int i,int n){
		int largest = i;
		int left = left(i);
		int right = left+1;
		if(left<n && a[largest]<a[left])
			largest = left;
		if(right<n && a[largest]<a[right])
			largest = right;
		if(largest!=i){
			swap(a,i,largest);
			maxHeapify(a,largest,n);
		}
	}
	public int left(int i){
		return 2*i+1;
	}
	public void swap(int[] a,int i,int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
