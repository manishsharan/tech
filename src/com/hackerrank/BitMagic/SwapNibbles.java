package com.hackerrank.BitMagic;

import java.util.Scanner;

/**
 * Created by manish.sharan on 04/01/15.
 */
public class SwapNibbles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(((input & 0x0F)<<4));
        System.out.println((input>>4)|(((input&0x0F)<<4)));
    }
}
