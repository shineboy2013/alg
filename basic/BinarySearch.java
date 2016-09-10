public int indexOf(int[] a, int key){
		int lo = 0, hi=a.length-1;
		while(lo<=hi){
			int mid = lo+(hi-lo)/2;
			if(a[mid]==key)
				return mid;
			else if(a[mid]<key)
				lo = mid+1;
			else hi = mid-1;
		}
		return -1;
	}
	
	public int firstEqualOrGreater(int[] a, int key){
		int lo = 0, hi=a.length-1;
		while(lo<=hi){
			int mid = lo+(hi-lo)/2;
			if(a[mid]<key)
				lo = mid+1;
			else hi = mid-1;
		}
		return lo;
	}
