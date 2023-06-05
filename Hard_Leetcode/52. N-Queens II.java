class Solution {
    static int c=0;
    public int totalNQueens(int n) {
        boolean[][] board=new boolean[n][n];
        c=0;
        nqueen(board,0,n);
        return c;
    }
    public static void nqueen(boolean[] [] board,int row,int tq) {
		if(tq==0) {
			//Display(board);
			c++;
			return;
		}
		if(row==board.length) {
			return;
		}
		for(int col=0;col<board.length;col++) {
			if(isitpossible(board,row,col)==true) {
				board[row][col]=true;
				nqueen(board, row+1, tq-1);
				board[row][col]=false;
			}
		}
	}
	public static boolean isitpossible(boolean [][] board,int row,int col) {
		
		int r=row;
		while(r>=0) {
			if(board[r][col]==true) {
				return false;
			}
			r--;
		}
		//left diagonal
		 r=row;
		int c=col;
		while(r>=0 && c>=0) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c--;
		}
		//right diagoanl
		r=row;
		c=col;
		while(r>=0 && c<board.length) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}
}
