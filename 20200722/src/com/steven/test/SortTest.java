package com.steven.test;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author StevenChen
 * @version 1.0
 */
public class SortTest {

    /**
     * 冒泡排序
     * */
    @Test
    public void dichotomy(){
        int[] arr = {1,3,5,7,9,11,13,15,17};
        int lowIndex = 0;
        int hightIndex = arr.length - 1;
        int middleIndex = (lowIndex + hightIndex) / 2;

        int result = -1;
        int targe = 13;

        while (lowIndex <= hightIndex){
            if (arr[middleIndex] == targe){
                result = middleIndex;
                break;
            }else if (arr[middleIndex] <= targe){
                lowIndex = middleIndex + 1;
            }else if (arr[middleIndex] >= targe){
                hightIndex = middleIndex - 1;
            }
            middleIndex = (lowIndex + hightIndex) / 2;
        }
        System.out.println(result);
    }

    /**
     * 选择排序
     * */
    @Test
    public void selectSort(){
        int[] arr = { 101, 2, 23, 133, 412, 23, 412, 51, 235 };
        for (int i = 0 , j = arr.length - 1; i < j; i++) {
            for (int m = i + 1, n = arr.length; m < n; m++) {
                if (arr[i] > arr[m]){
                    int temp = arr[i];
                    arr[i] = arr[m];
                    arr[m] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 冒泡排序
     * */
    @Test
    public void bubblesort(){
        int[] arr = { 101, 2, 23, 133, 412, 23, 412, 51, 235 };
        for (int i = 0 , j = arr.length - 1; i < j; i++) {
            for (int m = 0, n = arr.length - 1 - i; m < n; m++) {
                if (arr[m] > arr[m + 1]){
                    int temp = arr[m];
                    arr[m] = arr[m + 1];
                    arr[m + 1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 插入排序
     * */
    @Test
    public void nsertionSort(){
        int[] arr = { 101, 2, 23, 133, 412, 23, 412, 51, 235 };
        for (int i = 0, j = arr.length; i < j; i++) {
            for (int m = i; m > 0; m--){
                if (arr[m] > arr[m - 1]){
                    int temp = arr[m];
                    arr[m] = arr[m - 1];
                    arr[m - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
