public int getHighest(Box[] boxes){
		return getHighest(boxes,0,new Box[boxes.length],0);
	}
	public int getHighest(Box[] boxes, int st, Box[] re, int bindex){
		if(st>=boxes.length)
			return 0;
	
		int result = 0;
		for(int i=st;i<boxes.length;i++){
			if(isValid(re,bindex,boxes[i])){
				re[bindex] = boxes[i];
				int tmpH = getHighest(boxes,i+1,re,bindex+1);
				if(tmpH+re[bindex].height>result)
					result = tmpH+re[bindex].height;
			}
		}
		return result;
	}
	boolean isValid(Box[] re, int bindex, Box newBox){
		if(bindex==0)
			return true;
		if(bindex>0 && re[bindex-1].height<newBox.height && re[bindex-1].width < newBox.width
				&& re[bindex-1].depth<newBox.depth)
			return true;
		else return false;
	}
	
	public void swap(Box[] boxes, int i, int j){
		Box tmp = boxes[i];
		boxes[i] = boxes[j];
		boxes[j] = tmp;
	}
	
	class Box{
		int height;
		int width;
		int depth;
		public Box(int h, int w, int d){
			height = h;
			width = w;
			depth = d;
		}
	}
