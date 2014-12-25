package com.hackerrank.sort;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * Created by manish.sharan on 25/12/14.
 */
public class QuickSort {
    public static void main(String[] args) {
        int [] numbers = new int[args.length];
        for(int i=0;i<args.length;i++){
            numbers[i] = Integer.valueOf(args[i]);
        }
        quickSort(numbers);
        for(int i=0;i<args.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            int pivotPosition = numbers.length-i-1;
            quickSortOnPivot(numbers,pivotPosition);
        }
    }

    public static void quickSortOnPivot(int[] numbers,int pivotPosition){
        for(int i=0;i<pivotPosition;i++){
            if(numbers[i]>numbers[pivotPosition]){
                swap(numbers,i, pivotPosition);
            }else continue;
        }
    }

    public static void swap(int[] numbers,int positionA, int positionB){
        int c = numbers[positionB];
        numbers[positionB] = numbers[positionA];
        numbers[positionA] = c;
    }
}
