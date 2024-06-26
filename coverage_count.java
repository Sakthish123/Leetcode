class Solution {
    public int findCoverage(int[][] matrix) {
        int n=matrix.length;
        int count=0;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    try{
                        if(matrix[i-1][j]==1)
                          count++;
                    }
                    catch(Exception e){}
                    try{
                        if(matrix[i][j-1]==1)
                          count++;
                    }
                    catch(Exception e){}
                    try{
                        if(matrix[i+1][j]==1)
                          count++;
                    }
                    catch(Exception e){}
                    try{
                        if(matrix[i][j+1]==1)
                          count++;
                    }
                    catch(Exception e){}
                }
            }
        }
        return count;
    }
}
