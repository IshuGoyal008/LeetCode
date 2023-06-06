class Solution {
    public int maximumGap(int[] nums) {
        return fun(nums);
    }
    public static int fun(int []arr){
        if(arr.length<2){
            return 0;
        }
        int max=0;
        //int max=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
                int k=arr[i+1]-arr[i];
                max=Math.max(max,k);
            }
        return max;
    }
}
