class Solution {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        
        for(char[] row:board){
            Arrays.fill(row,'.');
        }
        backtrack(board,0,n);
        return result;
    }
    public void backtrack(char[][] board,int row,int n){
        if(row==n){
            result.add(construct(board));
        }
        for(int col=0;col<n;col++){
            if(isSafe(board,row,col,n)){
                board[row][col]='Q';
                backtrack(board,row+1,n);
                board[row][col]='.';
            }
        }

    }
    public boolean isSafe(char[][] board,int row,int col,int n){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q') return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q')return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
    public List<String> construct(char[][] board){
        List<String> path = new ArrayList<>();
        for(char[] row:board){
            path.add(new String(row));
        }
        return path;
    }
}