	
/*
Problem: 		combination,zuhe
Alg/struture:	Backtracking, Bit Manipulation
Idea:			
Example:
xy =>x,b=x|xy,b=xy|y,b=y 
xy =>01,10,11
Time, Space:	O(2^n), O(1)		
*/
	
	public void combination(char[] a){
        if(null == a || a.length == 0)  
            return; 
		char[] b =new char[a.length];
		combine3(a,0,b,0);
	}
	
	public void combine(char[] a, int st, char[] b, int bindex){
		if(st==a.length)
			return;
		for(int i=st;i<a.length;i++){
			b[bindex] = a[i];
			System.out.println(new String(b).trim());
			combine(a,i+1,b.clone(),bindex+1);
		}
	}
	   
	public void combine3(char[] a, int st, char[] b, int bindex){
		if(st==a.length)
			return;
		for(int i=st;i<a.length;i++){
			b[bindex] = a[i];
			System.out.println(new String(b).substring(0, bindex+1));
			combine3(a,i+1,b,bindex+1);//no clone
		}
	}

	
    public void combine2(char[] a){
        int n = a.length;                                 
        int nbit = 1<<n;                                     
        System.out.print("全组合结果个数为："+nbit);
        
        for(int i=0 ;i<nbit ; i++) {//结果有nbit个。输出结果0,1,2,3,....2^n。
            for(int j=0; j<n; j++) {//j比较i的每一个二进制位(每个字符的控制位)，如果为1输出
                int tmp = 1<<j ;        
                if((tmp & i)!=0) 
                    System.out.print(a[j]);
            }
            System.out.println();
        }
    }
