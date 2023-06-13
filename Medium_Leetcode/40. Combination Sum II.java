class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
           List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans =new ArrayList<>();
        Arrays.sort(candidates);
        fun(candidates,target,list,0,ans);
        return ans;
    }
    public static void fun(int [] coin,int amount,List<Integer> list,int idx,List<List<Integer>> ans) {
		if(amount==0) {
			ans.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i=idx;i<coin.length;i++) {
            if(i!=idx && coin[i]==coin[i-1]){
                continue;
            }
			if(amount>=coin[i]) {
                list.add(coin[i]);
				fun(coin,amount-coin[i],list,i+1,ans);
                   list.remove(list.size()-1);
			}
		}
    }
}
