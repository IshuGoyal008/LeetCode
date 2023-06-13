class Solution {
    public List<List<Integer>> permute(int[] nums) {
      //  String str=Arrays.toString(nums);
      boolean []vis=new boolean[nums.length];
        List<Integer> list=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		printPermutations(nums,list,ans,vis);
        return ans;
    }
    public static void printPermutations(int[]arr,List<Integer> list,	List<List<Integer>> ans,boolean[]visited) {
		if(list.size()==arr.length){
            ans.add(new ArrayList<Integer>(list));
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(visited[i]==true){
                continue;
            }
            list.add(arr[i]);
            visited[i]=true;
            printPermutations(arr,list,ans,visited);
            list.remove(list.size()-1);
            visited[i]=false;
        }
	}
}
