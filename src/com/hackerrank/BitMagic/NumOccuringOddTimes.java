package com.hackerrank.BitMagic;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by manish.sharan on 03/01/15.
 */
public class NumOccuringOddTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(input,",");
        int val = Integer.valueOf(tokenizer.nextToken());
        while(tokenizer.hasMoreTokens()){
            int inVal = Integer.valueOf(tokenizer.nextToken());
            val = val ^ inVal;
        }
        if(val>0) System.out.println(val);
    }
}
