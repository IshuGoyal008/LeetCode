class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                    
                }
                
            }
            if(c==1){
                ans=nums[i];
            }
        }
        return ans;
    }
}
