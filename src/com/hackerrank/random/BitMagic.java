package com.hackerrank.random;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by manish.sharan on 06/01/15.
 */
public class BitMagic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for(int i=0;i<input;i++){
            long integer = scanner.nextLong();
            System.out.println((int)Math.pow(2,32)-1);
            System.out.println((long)(Math.pow(2,32))-(integer+1));
        }
    }
}
