package com.datastructure.problemsolving;

import java.util.ArrayList;
/*
*
*Consider a rat placed at (0, 0) in a square matrix of order N * N. It has to reach the destination at (N - 1, N - 1).
*  Find all possible paths that the rat can take to reach from source to destination. The directions in which the rat
*  can move are 'U'(up), 'D'(down), 'L' (left), 'R' (right). Value 0 at a cell in the matrix represents that it is blocked
*  and rat cannot move to it while value 1 at a cell in the matrix represents that rat can be travel through it.
Note: In a path, no cell can be visited more than one time.

Example 1:

Input:
N = 4
m[][] = {{1, 0, 0, 0},
         {1, 1, 0, 1},
         {1, 1, 0, 0},
         {0, 1, 1, 1}}
Output:
DDRDRR DRDDRR
Explanation:
The rat can reach the destination at
(3, 3) from (0, 0) by two paths - DRDDRR
and DDRDRR, when printed in sorted order
we get DDRDRR DRDDRR.
*
* */
public class MousePaths {
    public static void main(String a[]){
       int m[][] = {{1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}};
        findPath(m,4);
    }

    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> paths = new ArrayList<String>();
        boolean[][] marker = new boolean[n][n];
        marker[0][0]=true;
        paths = findAllPath(marker,paths,m,n,0,0,"");
        System.out.println(paths);
        return paths;
    }
    public static ArrayList<String> findAllPath(boolean[][] marker, ArrayList<String> paths, int[][] m,int n, int i,int j,String path){
        if(i+1==n && j+1==n){
            paths.add(path);
            return paths;
        }
        if(i-1>=0 && !marker[i-1][j] && m[i-1][j]==1){
            marker[i-1][j] = true;
            paths= findAllPath(marker,paths,m,n,i-1,j,path+"U");
            marker[i-1][j] = false;
        }
        if(j-1>=0 && !marker[i][j-1] &&m[i][j-1]==1){
            marker[i][j-1] = true;
            paths =  findAllPath(marker,paths,m,n,i,j-1,path+"L");
            marker[i][j-1] = false;
        }
        if(i+1<n && !marker[i+1][j] && m[i+1][j]==1){
            marker[i+1][j]= true;
            paths = findAllPath(marker,paths,m,n,i+1,j,path+"D");
            marker[i+1][j]= false;
        }
        if(j+1<n && !marker[i][j+1] && m[i][j+1]==1){
            marker[i][j+1] = true;
            paths = findAllPath(marker,paths,m,n,i,j+1,path+"R");
            marker[i][j+1] = false;
        }
        return paths;

    }

}
