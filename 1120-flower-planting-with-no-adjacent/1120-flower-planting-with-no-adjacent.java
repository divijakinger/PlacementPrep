class Solution {
    public int[] gardenNoAdj(int n, int[][] paths) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        for(int i = 0; i <= n ;i++){
            matrix.add(new ArrayList<>());
        }
        int x,y;
        for (int i = 0; i < paths.length; i++)
        {
            x = paths[i][0]; y = paths[i][1];
            matrix.get(x).add(y);
            matrix.get(y).add(x);
        }

        int[] colors = new int[n];

        colors = solve(matrix, colors, 1);

        return colors;
    }

    int[] solve( ArrayList<ArrayList<Integer>> matrix, int[] colors, int node){
        if  (node == matrix.size())
            return colors;
        
        for (int col=1;col<=4;col++){
            if (isSafe(matrix,colors,col,node)){
                colors[node-1] = col;
                if (solve(matrix,colors,node+1)!=null)
                    return colors;
                colors[node-1] = 0;
            }
        }
        return colors;
    }

    boolean isSafe( ArrayList<ArrayList<Integer>> matrix, int[] colors, int color, int currentNode)
    {

        ArrayList<Integer> list =  matrix.get(currentNode);
        for(int j = 0; j < list.size(); j++)
        {
            if(colors[list.get(j)-1] == color)
                return false;

        }

        return true;
    }
    
}