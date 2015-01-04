package com.hackerrank.BitMagic;

import java.util.Scanner;

/**
 * Created by manish.sharan on 03/01/15.
 */
public class RightmostBitPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int positionCount = 1;
        while(value>0){
            if((value&1)==1){
                System.out.println(positionCount);
                break;
            }else{
                positionCount++;
            }
            value = value>>1;
        }
    }
}
