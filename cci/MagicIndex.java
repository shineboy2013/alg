public int magicIndex(int[] arr){
		return magicIndex3Recursive(arr, 0, arr.length-1);
	}
	public int magicIndex3Recursive(int[] arr, int lo, int hi){
		if(lo>hi)
			return -1;
		
		int mid = lo+(hi-lo)/2;
		if(mid==arr[mid])
			return mid;
		int result = -1;
		result = magicIndex3Recursive(arr,lo,Math.min(arr[mid], mid-1));
		if(result!=-1)
			return result;
		return  magicIndex3Recursive(arr,Math.max(arr[mid], mid+1),hi);		
	}
