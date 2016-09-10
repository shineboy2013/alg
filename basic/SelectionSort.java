	//pick the min and swap to its pos
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
