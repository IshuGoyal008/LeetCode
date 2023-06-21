class Solution {
     public void rotate(int[] nums, int k) {
        Rotate(nums,k);
    }
    public static void Rotate(int[] arry,int x) {
		int k=x%arry.length;
		int n=arry.length;
		Reverse(arry,n-k,n-1);
		Reverse(arry,0,n-k-1);
		Reverse(arry,0,n-1);
	}
	public static void Reverse(int arry[],int i,int j) {
		while(i<j) {
			int temp=arry[i];
			arry[i]=arry[j];
			arry[j]=temp;
			i++;
			j--;
		}
    }
}
