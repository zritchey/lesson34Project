package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [][]a={{1,2,-2,0},{-3,4,7,2},{6,0,3,1}};
        int [][]b={{-1,3},{0,9},{1,-11},{4,-5}};
        int[][]end=MatrixMult.mult(a,b);
        for(int i=0;i<end.length;i++){
            for(int x=0;x<end[0].length;x++){
                System.out.print(end[i][x]+"\t");
            }
            if(i<end.length-1)
                System.out.println();
        }

    }
}
