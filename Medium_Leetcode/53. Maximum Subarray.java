class Solution {
    public int maxSubArray(int[] nums) {
        return kadanes(nums);
    }
    public static int kadanes(int [] arr) {
		int ans=Integer.MIN_VALUE;
		int prevsum=0;
		for (int i = 0; i < arr.length; i++) {
			prevsum+=arr[i];
			ans=Math.max(ans, prevsum);
			
			if(prevsum<0) {
				prevsum=0;
			}
		}
		return ans;
		
	}
}
