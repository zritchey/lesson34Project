package com.company;

/**
 * Created by zr162 on 12/21/16.
 */
public class MatrixMult {
    static public int [][]mult(int[][]a,int[][]b){
        int [][]mtrx=new int [a.length][b[0].length];
        for(int r=0;r<a.length;r++){
            for (int c=0;c<b[0].length;c++ ){
                for (int i=0;i<b.length;i++) {
                    mtrx[r][c] +=(a[r][i]*b[i][c]);
                }
            }
        }
        return mtrx;
    }
}
