class Solution {
    public int splitArray(int[] nums, int k) {
        return fun(nums,k);
    }

    public static int fun(int []arr,int k){
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=Math.max(start,arr[i]);
            end+=arr[i];
        }

        while(start<end){
            int mid=start+((end-start)/2);
            int sum=0;
            int pieces=1;
            for(int num:arr){
                if(num+sum>mid){
                    sum=num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            if(pieces<=k){
                end=mid;
            }
            else{
                start=mid+1;
            }

        }
        return start;
    }
}
