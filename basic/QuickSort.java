/*
	 Problem: 		quick sort,kuaisupaixu
	 Alg/struture:	
	 Idea:			
	 Example:
	 pivot=4
	 [3,8,2,1,6,4] swap 3,3 
	 [3,8,2,1,6,4] no swap
	 [3,2,8,1,6,4] swap 8,2
	 [3,2,1,8,6,4] swap 8,1
	 [1,2,3,4,6,8] after loop, swap pivot=4,firstHigher=8
	 Time, Space:	O(nlogn), O(logn)		
*/
	public void quickSort(int[] a){
		if(a==null || a.length==0)
			return;
		qsort(a,0,a.length-1);
	}
	
	public void qsort(int[] a, int left, int right){
		if(left>=right)
			return;
		int pivotIndex = partition(a,left,right);
		qsort(a,left,pivotIndex-1);
		qsort(a,pivotIndex+1,right);
	}
	
	public int partition(int[] a, int left, int right){
		int pivot = a[right];
		int firstHiger = left;
		for(int i=left;i<right;i++){
			if(a[i]<pivot)
				swap(a,firstHiger++,i);
		}
		swap(a,firstHiger,right);
		return firstHiger;
	}
	public void swap(int[] a, int i, int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
		
	}
