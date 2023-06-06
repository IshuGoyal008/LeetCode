class Solution {
    public int minPatches(int[] nums, int n) {
            return fun(nums,n);
    }
    public static int fun(int []arr,int n){
        int c=0;
        long missing=1;
        int i=0;
        while(missing<=n){
            if(i<arr.length && missing>=arr[i]){
                missing+=arr[i];
                i++;
            }
            else{
                missing+=missing;
                c++;
            }
        }
        return c;
    }
}
