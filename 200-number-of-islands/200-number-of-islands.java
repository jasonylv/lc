class Solution {
    int rc = 0;
    public int numIslands(char[][] grid) {
        for (int i=0;i<grid.length;i++)
            for (int j=0;j<grid[i].length;j++)
                if ( grid[i][j] == '1' )
                { dfs(grid,i,j);
                    rc++;
                }
        
        return rc;
    }
    void dfs(char[][] grid,int i,int j) {
        if ( i < 0 || j < 0 || i == grid.length || j == grid[i].length || grid[i][j] == '0' ) return;
        grid[i][j] = '0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
        
    }
}