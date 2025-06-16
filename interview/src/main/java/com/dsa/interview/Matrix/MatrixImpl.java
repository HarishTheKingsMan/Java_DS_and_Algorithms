package com.dsa.interview.Matrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MatrixImpl {

    public Boolean isValdSudoko(char[][] board) {
        
        //Step 1: Preprocessing
        HashSet<Character>[] rowSets = new HashSet[9];
        HashSet<Character>[] columnSets = new HashSet[9];
        HashSet<Character>[] boxSets = new HashSet[9];

        for(int i = 0; i < rowSets.length; i++){
            rowSets[i] = new HashSet<>();
            columnSets[i] = new HashSet<>();
            boxSets[i] = new HashSet<>();
        }

        //Step 2: Iterate through the 2D array
        for(int i = 0; i < rowSets.length; i++){
            for(int j = 0; j < columnSets.length; j++){

                char ch = board[i][j];

                //Step 3: Dot has to be move on
                if(ch == '.') continue;

                //Step 4: Checking in rowSet, ColumnSet and BoxSet
                if(rowSets[i].contains(ch)) return false;
                rowSets[i].add(ch);

                if(columnSets[j].contains(ch)) return false;
                columnSets[j].add(ch);

                int boxIndex = (i / 3) * 3 + (j / 3); /// *3 for grouping
                if(boxSets[boxIndex].contains(ch)) return false;
                boxSets[boxIndex].add(ch);
            }
        }

        System.out.println("RowSets: ");
        printHashSet(rowSets);
        System.out.println("ColumnSets: ");
        printHashSet(columnSets);
        System.out.println("BoxSets : ");
        printHashSet(boxSets);

        return true;
    }

    private void printHashSet(HashSet<Character>[] hash){
        for (HashSet<Character> set : hash) {
            System.out.println(set);
        }
    }

    public List<Integer> spiralResult(int[][] matrix) {
        
        //Step 1: Initialization
        List<Integer> result = new ArrayList<>();

        int left = 0;
        int right = matrix[0].length - 1;

        int top = 0;
        int bottom = matrix.length - 1;

        //EC:
        if(matrix == null ||matrix.length == 0) return result;

        //Step 2: Iteration
        while( left <= right && top <= bottom){
            
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;


    }

    public void rotateImage(int[][] matrix) {
        
        int n = matrix.length;

        //Step 1: Traverse the matrix
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Step 2: Reverse the matrix
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 -  j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    public void matrixZeros(int[][] matrix) {
        
        //Step 1: Initialization
        int m = matrix.length;
        int n = matrix[0].length;

        Boolean firstRow = false;
        Boolean firstColumn = false;

        //Step 2: Set and Mark the rows and columns
        for( int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                if(matrix[i][j] == 0){

                    //Step 3: Checking if that is first row and column
                    if(i == 0) firstRow = true;
                    if(j == 0) firstColumn = true;

                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //Step 4: Mark Zeros based on marked r and c
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){

                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        //Step 5: Exceptional for First Column and First Row
        if(firstRow){
            for(int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }

        if(firstColumn){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }

    
    int DEAD = 0;
    int ALIVE = 1;
    int DEADTOALIVE = 2;
    int ALIVETODEAD = 3;

    private Boolean isAlive(int[][] board, int row, int col){
        return (row >= 0 && row < board.length && col >= 0 && col < board[0].length &&
        (board[row][col] == ALIVE || board[row][col] == ALIVETODEAD));
    }

    public void LifeOfDeath(int[][] board) {
        
        //Step 1: Preprocessing
        int[][] directions = {
            {-1, 0}, {0, 1}, {1, 0}, {0, -1}, 
            {-1, -1}, {1, -1}, {-1, 1}, {1, 1}
        };

        int m = board.length;
        int n = board[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                int alive = 0;

                //Step 2: Counting the Alive Status of Neighbors
                for(int[] direction : directions){
                    alive += isAlive(board, i + direction[0], j + direction[1]) ? 1 : 0;
                }

                //Step 3: Conditions for DEAD AND ALIVE
                if(board[i][j] == DEAD){
                    if(alive == 3){
                        board[i][j] = DEADTOALIVE;
                    }
                }else{
                    if(alive != 3 && alive != 2){
                        board[i][j] = ALIVETODEAD;
                    }
                }
            }
        }

        //Step 4: Changing back to ALIVE AND DEAD
        for(int  r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){

                if(board[r][c] == DEADTOALIVE){
                    board[r][c] = ALIVE;
                }else if(board[r][c] == ALIVETODEAD){
                    board[r][c] = DEAD;
                }
            }
        }


    }


    
}
