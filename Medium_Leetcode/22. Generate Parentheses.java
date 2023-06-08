class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> list=new ArrayList<>();
		Parenthesis(n, 0, 0, "",list);
        return list;
    }
    public static void Parenthesis(int n,int open,int close,String ans,List<String> list) {
		if(open==n && close==n) {
			//System.out.println(ans);
			list.add(ans);
			return;
		}
		if(open<n) {
			Parenthesis(n, open+1, close, ans+'(',list);
		}
		if(close<open) {
			Parenthesis(n, open, close+1, ans+')',list);
		}
	}
}
