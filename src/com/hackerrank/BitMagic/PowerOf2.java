package com.hackerrank.BitMagic;

import java.util.Scanner;

/**
 * Created by manish.sharan on 03/01/15.
 */
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        String binary = Integer.toBinaryString(value);
        if(Integer.bitCount(value)==1 && binary.startsWith("1")){
            System.out.println("power of 2");
        }else{
            System.out.println("Not a power of 2");
        }
    }
}
