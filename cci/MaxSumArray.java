	public int maxSum(int[] a){
		int maxsum = Integer.MIN_VALUE;
		int sum = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			sum = Math.max(0, sum)+a[i];
			if(sum>maxsum)
				maxsum = sum;
		}
		return maxsum;
	}
