class Solution {
    public void solveSudoku(char[][] board) {
        Sudoku(board,0,0);
    }
    public static boolean Sudoku(char [][] grid,int row,int col) {
		if(col==9) {
			row++;
            col=0;
		}
		if(row==9) {
		return true;
		}
		if(grid[row][col]!='.') {
			return Sudoku(grid,row,col+1);
		}
		else {
			for(int val='1';val<='9';val++) {
                char c=(char)val;
				if(isitpossible(grid,row,col,c)==true) {
					grid[row][col]=c;
					if(Sudoku(grid, row, col+1)) return true;
					grid[row][col]='.';
				}
			}
		}
        return false;
	}
	public static boolean isitpossible(char [][]grid,int row,int col,char val) {
		//col
		int r=0;
		while(r<9) {
			if(grid[r][col]==val) {
				return false;
			}
			r++;
		}
		//row
		int c=0;
		while(c<9) {
			if(grid[row][c]==val) {
				return false;
			}
			c++;
		}
		//3*3
		r=row-row%3;
		c=col-col%3;
		for(int i=r;i<r+3;i++) {
			for(int j=c;j<c+3;j++) {
				if(grid[i][j]==val) {
					return false;
				}
			}
		}
		return true;
	}
}
