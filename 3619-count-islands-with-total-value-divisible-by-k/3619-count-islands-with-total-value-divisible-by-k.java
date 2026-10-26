class Solution {
    public int countIslands(int[][] grid, int k) {
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];

        for (int row=0;row<grid.length;row++)
        {
            for (int col=0;col<grid[0].length;col++)
            {
                if (!visited[row][col] && grid[row][col]>0)
                {
                    long sum = sumDFS(grid,visited,row,col);
                    if (sum%k==0)
                        ans++;
                }
            }
        }
        return ans;
    }

    public long sumDFS(int[][] grid, boolean[][] visited,int row,int col)
    {
        int[][] dir = {{0,-1},{0,1},{-1,0},{1,0}};
        int n = grid.length;
        int m = grid[0].length;
        long sum = grid[row][col];
        visited[row][col] = true;

        // visiting all four directions
        for (int k=0;k<4;k++)
        {
            int x = row + dir[k][0];
            int y = col + dir[k][1];

            if (x>=0 && y>=0 && x<n && y<m && !visited[x][y] && grid[x][y]>0)
            {
                sum += sumDFS(grid,visited,x,y);
            } 
        }

        return sum;
    }
}