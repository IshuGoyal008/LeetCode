class Solution {
    public int maximalRectangle(char[][] matrix) {
			int[][]mat=new int [matrix.length][matrix[0].length];
			for(int i=0;i<matrix.length;i++){
				for(int j=0;j<matrix[i].length;j++){
					mat[i][j]=Character.getNumericValue(matrix[i][j]);
				}
			}
        	int [][]arr=new int [mat.length][mat[0].length];
				//int [][] arr=arr.toCharArray(arr);
				int ans=0;
				for (int i = arr.length-1; i >= 0; i--) {
			for (int j = 0; j < arr[0].length; j++) {
				if(i==arr.length-1) {
					arr[i][j]=mat[i][j];
				}
				else {
					arr[i][j]=mat[i][j]==1 ? arr[i+1][j]+1:0;
				}
			}
			ans=Math.max(ans, Area(arr[i]));
		}
				//System.out.println(ans);
                return ans;
	}
	
	public static int Area(int []arr) {
		Stack<Integer> st=new Stack<>();
		int ans=0;
		for (int i = 0; i < arr.length; i++) {
			
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				
				int r=i;
				int h=arr[st.pop()];
				if(st.isEmpty()) {
					ans=Math.max(ans, h*r);
				}
				else {
					int l=st.peek();
					ans=Math.max(ans, h*(r-l-1));
				}
			}
			st.push(i);
		}
		int r=arr.length;
		while(!st.isEmpty()) {
			int h=arr[st.pop()];
			if(st.isEmpty()) {
				ans=Math.max(ans, h*r);
			}
			else {
				int l=st.peek();
				ans=Math.max(ans, h*(r-l-1));
			}
		}
		return ans;
		}
}
