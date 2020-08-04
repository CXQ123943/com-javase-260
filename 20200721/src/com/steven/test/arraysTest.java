package com.steven.test;


import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class arraysTest {

    @Test
    public void arraysOne(){
        int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        int sum = 0;
        for (int[] e1: arr){
            for (int e2: e1){
                sum = sum + e2;
            }
        }
        System.out.println(sum);
    }

    @Test
    public void arraysTwo(){
        int i,j;
        int a[][];
        a=new int[10][10];
        for(i=0;i<10;i++){
            a[i][i]=1;
            a[i][0]=1;
        }
        for(i=2;i<10;i++){
            for(j=1;j<=i;j++){
                a[i][j]=a[i-1][j-1]+a[i-1][j];
            }
        }
        for(i=0;i<10;i++){
            for(j=0;j<i;j++){
                System.out.printf(" "+a[i][j]);
            }
            System.out.println();
        }
    }

/*    @Test
    public void arraysThree(){
        int i, j;
        int[][] arr = new int[10][10];
        for (i = 0; i < 10; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
        for (i = 2; i < 10; i++){
            for (j = 1; j <=i ;j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
        for (i = 0; i < 10; i++){
            for (j = 0; j < i+1; j++){
                System.out.printf(" " + arr[i][j]);
            }
            System.out.println();
        }
    }*/
}
