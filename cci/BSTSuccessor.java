public TreeNode bstSuccessor(TreeNode n) {
		if (n == null)
			return null;

		TreeNode result;
		if (n.right != null) {
			result = n.right;
			while (result.left != null)
				result = result.left;
			return result;

		}
		if (n.parent != null) {
			TreeNode c = n.parent;// n=1.5,c=1,
			result = c.parent;// 2
			while (result != null && result.left == c) {
				c = result;// c=2
				result = result.parent;// result=null
			}
			return c;

		}
		return null;

	}

	class TreeNode {
		TreeNode left;
		TreeNode right;
		TreeNode parent;
		int val;
		public TreeNode(int n){
			val = n;
		}
	}
