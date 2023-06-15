class Solution {
    public void sortColors(int[] nums) {
        int temp=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j+1]<nums[j]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}
