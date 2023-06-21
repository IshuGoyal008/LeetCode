class Solution {
    public int findPeakElement(int[] nums) {
        int max=nums[0];
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                a=i;
            }
        }
        return a;
    }
}
