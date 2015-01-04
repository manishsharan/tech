package com.hackerrank.BitMagic;

import java.util.Scanner;

/**
 * Created by manish.sharan on 05/01/15.
 */
public class PositionOfSetBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count = 0;
        while(input!=0){
            if((input&0)==0){ input = input>>1; count++;}
            else break;
        }
        System.out.print(count);
    }
}
