	/*
	 Problem: 		permutation,pailie
	 Alg/struture:	Backtracking
	 Idea:			
	 Example:
	 ab swap a,a->ab
	 	swap a,b->ba
	 Time, Space:	O(n!), O(1)		
 */
	public void permutation(char[] a){
		arrange(a,0);
	}
	public void arrange(char[] a, int st){
		if(st==a.length-1){
			System.out.print(new String(a)+",");
			return;
		}
		for(int i=st;i<a.length;i++){
			swap(a,st, i);
			arrange(a.clone(),st+1);
			//swap(a,st, i);
		}
	}
	public void swap(char[] a, int i, int j){
		char tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
