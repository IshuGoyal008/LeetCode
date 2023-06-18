class Solution {
    public boolean exist(char[][] maze, String word) {
        for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if(maze[i][j]==word.charAt(0)) {
					boolean ans=PrintPath(maze,i,j,word,0);
					if(ans==true) {
						return true;
					}
				}
			}
		}
		return false;
    }

    public static boolean PrintPath(char[][]maze,int cr,int cc,String word,int idx) {
		if(idx==word.length()) {
			return true;
		}
		if(cr<0||cr>=maze.length||cc<0||cc>=maze[0].length||maze[cr][cc]!=word.charAt(idx)) {
			return false;
		}
		
		int r[]= {0,0,1,-1};
		int c[]= {1,-1,0,0};
		maze[cr][cc]='*';
		for (int i = 0; i < c.length; i++) {
			boolean ans=PrintPath(maze,cr+r[i],cc+c[i],word,idx+1);
		if(ans==true) {
			return true;
		}
		}
		maze[cr][cc]=word.charAt(idx);
		return false;
		
	}
}
