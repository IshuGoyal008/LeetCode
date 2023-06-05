class Solution {
    public int trap(int[] height) {
        return Trapping_water(height);
    }
    public static int Trapping_water(int[] arry) {
		int[] left=new int[arry.length];
		left[0]=arry[0];
		for(int i=1;i<left.length;i++) {
			left[i]=Math.max(left[i-1], arry[i]);
		}
		int[] right=new int[arry.length];
		right[right.length-1]=arry[right.length-1];
		for(int i=right.length-2;i>=0;i--) {
			right[i]=Math.max(right[i+1],arry[i]);
		}
		int sum=0;
		for(int i=0;i<arry.length;i++) {
			int a=Math.min(left[i],right[i])-arry[i];
			sum+=a;
		}
		return sum;
	}
}
