class Solution {
    public List<List<Integer>> combine(int n, int k) {
        boolean [] board=new boolean[n];
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        queen(board,k,0,list,0,ans);
        return ans;
    }

    public static void queen(boolean [] board,int tq,int qpsf,List<Integer> list,int idx,List<List<Integer>> ans) {
		if(tq==qpsf) {
			ans.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i=idx;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
                list.add(i+1);
				queen(board, tq, qpsf+1,list,i+1,ans);
                list.remove(list.size()-1);
                board[i]=false;
			}
		}
	}
}
