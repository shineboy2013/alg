/*
	 Problem: 		merge sort,hebingpaixu
	 Alg/struture:	
	 Idea:			
	 Example:
	 [3,8,2,1,6,4]=>[238,146]=>[1,2,3,4,6,8]
	 Time, Space:	O(nlogn), O(n)		
  */
	public void mergeSort(int[] a){
		if(a==null || a.length==0)
			return;
		msort(a,0,a.length-1);
	}
	public void msort(int[] a, int left, int right){
		if(left>=right)
			return;
		int mid = left+(right-left)/2;
		msort(a,left,mid);
		msort(a,mid+1,right);
		merge(a,left,mid,right);
	}
	public void merge(int[] a,int left, int mid, int right){
		int[] tmp = new int[right-left+1];
		int i=left,j=mid+1,k=0;
		while(i<=mid && j<=right){
			if(a[i]<=a[j])
				tmp[k++] = a[i++];
			else
				tmp[k++] = a[j++];
		}
		while(i<=mid)
			tmp[k++] = a[i++];
		while(j<=right)
			tmp[k++] = a[j++];
		for(int p=0;p<tmp.length;p++){
			a[left+p] = tmp[p]; 
		}
	}
