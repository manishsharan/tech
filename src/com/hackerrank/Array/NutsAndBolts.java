package com.hackerrank.Array;

import com.hackerrank.sort.QuickSort;
/**
 * Created by manish.sharan on 25/12/14.
 */
public class NutsAndBolts {
    public static void main(String[] args) {
        char[] nuts = {'@', '#', '$', '%', '^', '&'};
        char[] bolts = {'$', '%', '&', '^', '@', '#'};

        int[] nutsInt = convertCharToIntArray(nuts);
        int[] boltsInt = convertCharToIntArray(bolts);

        QuickSort.quickSort(nutsInt);
        QuickSort.quickSort(boltsInt);

        print(nutsInt);
        print(boltsInt);
    }

    public static int[] convertCharToIntArray(char[] chars){
        int[] ints = new int[chars.length];
        for(int i=0;i<chars.length;i++){
            ints[i] = chars[i];
        }
        return ints;
    }

    public static void print(int[] ints){
        for(int i=0;i<ints.length;i++){
            System.out.print((char)ints[i]+" ");
        }
        System.out.println();
    }
}
