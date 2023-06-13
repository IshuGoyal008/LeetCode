class Solution {
    public int[] searchRange(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
        int a=fun1(nums,0,target);
        int b=fun2(nums,nums.length-1,target);
        return new int [] {a,b};
            }
        }
            return new int [] {-1,-1};
    }
    public static int fun1(int [] arr,int i,int tar){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==tar){
            return i;
        }
        return fun1(arr,i+1,tar);
    }
      public static int fun2(int [] arr,int i,int tar){
        if(i<0){
            return -1;
        }
        if(arr[i]==tar){
            return i;
        }
        return fun2(arr,i-1,tar);
    }
}
