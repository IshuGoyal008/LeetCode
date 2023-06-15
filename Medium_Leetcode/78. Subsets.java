class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        subset(nums,0,list,ans);
        return ans;
    }
    public static void subset(int [] arr,int i, List<Integer> list, List<List<Integer>> ans) {
		if(i==arr.length) {
			ans.add(new ArrayList<>(list));
			return;
		}
		
		subset(arr, i+1,list,ans);
        list.add(arr[i]);
		subset(arr, i+1,list,ans);
        list.remove(list.size()-1);
	}
}
