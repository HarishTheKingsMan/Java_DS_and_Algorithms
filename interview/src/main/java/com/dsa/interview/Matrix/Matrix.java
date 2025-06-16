package com.dsa.interview.Matrix;

import java.util.List;

public class Matrix {

    private static void printStatement(int[] nums, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        MatrixImpl array = new MatrixImpl();

        /*
         * Question 34: Valid Sudoku
         * Input: board =
            [
            ["5","3",".",".","7",".",".",".","."],
            ["6",".",".","1","9","5",".",".","."],
            [".","9","8",".",".",".",".","6","."],
            ["8",".",".",".","6",".",".",".","3"],
            ["4",".",".","8",".","3",".",".","1"],
            ["7",".",".",".","2",".",".",".","6"],
            [".","6",".",".",".",".","2","8","."],
            [".",".",".","4","1","9",".",".","5"],
            [".",".",".",".","8",".",".","7","9"]
            ]
            Output: true
         */

         char[][] sudokuInput = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        Boolean validSudoku = array.isValdSudoko(sudokuInput);
        System.out.println("Question 34: Valid Sudoku");
        System.out.println("is valid sudoku: " + validSudoku);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 35: Spiral Matrix  
         * Input: matrix = [[1,2,3],  
                 [4,5,6],  
                 [7,8,9]]  
            Output: [1,2,3,6,9,8,7,4,5]
         */

        int[][] spiral = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9} 
            };
        List<Integer> spiralOutput = array.spiralResult(spiral);
        System.out.println("Question 35: Spiral Matrix ");
        System.out.println("Spiral Output : " + spiralOutput);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 36 : Rotate Image
         * Input: matrix = [[1,2,3],  
                 [4,5,6],  
                 [7,8,9]]  
            Output: [[7,4,1],  
                    [8,5,2],  
                    [9,6,3]]
         */
        
        int[][] rotateInput = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9} 
            };

        array.rotateImage(rotateInput);
        System.out.println("Question 36: Rotate Image : ");
        System.out.println("Rotated Image : ");
        for(int i = 0; i < rotateInput.length; i++){
            printStatement(rotateInput[i], rotateInput[i].length);
        }
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 37: Set Matrix Zeroes
         * Input: matrix = [[1,1,1],  
                 [1,0,1],  
                 [1,1,1]]  
            Output: [[1,0,1],  
                    [0,0,0],  
                    [1,0,1]]
         */

         int[][] matrixZeros = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1} 
            };

        array.matrixZeros(matrixZeros);
        System.out.println("Question 37: Set Matrix Zeroes : ");
        System.out.println("Matrix Zeros : ");
        for(int i = 0; i < matrixZeros.length; i++){
            printStatement(matrixZeros[i], matrixZeros[i].length);
        }
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 38: Game of Life
         * board = [[0,1,0],  
                [0,0,1],  
                [1,1,1],  
                [0,0,0]]

            Output: [[0,0,0],  
                    [1,0,1],  
                    [0,1,1],  
                    [0,1,0]]
         */

        int[][] gameOfLife = {
            {0, 1, 0},
            {0, 0, 1},
            {1, 1, 1},
            {0, 0, 0}
        };
        array.LifeOfDeath(gameOfLife);
        System.out.println("Question 38: Game of Life :  ");
        System.out.println("Dead and Alive : ");
        for(int i = 0; i < gameOfLife.length; i++){
            printStatement(gameOfLife[i], gameOfLife[i].length);
        }
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------


        

    }
    
}
