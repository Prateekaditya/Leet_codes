class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m]; // Step 1: Row markers
        boolean[] col = new boolean[n]; // Step 1: Column markers

        // Step 2: Mark rows and columns with zeros
        for(int i = 0; i < m; i++) 
        {
            for(int j = 0; j < n; j++) 
            {
                if(matrix[i][j] == 0) 
                {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Step 3: Set entire rows to zero
        for(int i = 0; i < m; i++) 
        {
            if(row[i]) 
            {
                for(int j = 0; j < n; j++) 
                {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 4: Set entire columns to zero
        for(int j = 0; j < n; j++) 
        {
            if(col[j]) 
            {
                for(int i = 0; i < m; i++) 
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}