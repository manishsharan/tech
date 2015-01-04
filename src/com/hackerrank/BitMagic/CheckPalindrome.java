package com.hackerrank.BitMagic;

import java.util.Scanner;

/**
 * Created by manish.sharan on 04/01/15.
 */
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());
        int size = calculateSize(input);
        System.out.println("Size::"+size);
        int start = 1,end = size;
        while(start<size){
            if(isBitSetAt(input, start)!= isBitSetAt(input, end)){
                System.out.println("Not palindrome");
                return;
            }
            start++;end--;
        }
        System.out.println("Palindrome");
    }

    public static int calculateSize(int input){
        int count = 0;
        while(input!=0){
            input = input>>1;
            count++;
        }
        return count;
    }
    public static boolean isBitSetAt(int input, int size){
        boolean result = false;
        result = (((input>>(size-1))&1)==1) ? true:false;
        return result;
    }
}
