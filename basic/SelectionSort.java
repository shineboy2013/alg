	/*
	 Problem: 		selection sort,xuanzepaixu
	 Alg/struture:	
	 Idea:			pick the min and swap to its pos
	 Example:
	 [3,1,2,8,6,4] min=1, swap 1,3 
	 [1,3,2,8,6,4] min=2, swap 2,3
	 [1,2,3,8,6,4] min=4, swap 4,8
	 [1,2,3,4,6,8] 
	 Time, Space:		O(n^2), O(1)		
   */
	public void selectionSort(int[] a){
		for(int i=0;i<a.length;i++){
			int min = i;
			for(int j=i;j<a.length;j++)
				if(a[j]<a[min])
					min=j;
			swap(a,min,i);
		}
	}
	public void swap(int[] a, int i, int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
