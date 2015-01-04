package com.hackerrank.BitMagic;

import java.util.Scanner;

/**
 * Created by manish.sharan on 04/01/15.
 */
public class TurnOffParticularBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int bitLocation = scanner.nextInt();
        boolean isBitSet = false;
        if(((input>>(bitLocation-1))&1) == 1) isBitSet = true;
        int result = input;
        if(isBitSet){
            result = input - twoPowerOfBitLocation(bitLocation);
        }
        System.out.println(result);
    }

    public static int twoPowerOfBitLocation(int bitLocation){
        return 1<<(bitLocation-1);
    }
}
