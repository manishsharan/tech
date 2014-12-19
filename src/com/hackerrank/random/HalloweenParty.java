package com.hackerrank.random;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by manish.sharan on 19/12/14.
 */
public class HalloweenParty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseNo = Integer.valueOf(scanner.nextLine());
        for(int i=0;i<testCaseNo;i++){
            System.out.println(calculateMaxPieces(new BigInteger(scanner.nextLine())));
        }
    }

    public static BigInteger calculateMaxPieces(BigInteger lines){
        if(lines.remainder(new BigInteger("2")).compareTo(new BigInteger("0"))==0){
            return calculateMaxEvenPieces(lines);
        }else{
            return calculateMaxOddPieces(lines);
        }
    }

    public static BigInteger calculateMaxEvenPieces(BigInteger lines){
        BigInteger half = lines.divide(new BigInteger("2"));
        return half.pow(2);
    }

    public static BigInteger calculateMaxOddPieces(BigInteger lines){
        BigInteger maxEvenPieces = calculateMaxEvenPieces(lines.add(new BigInteger("1")));
        return maxEvenPieces.add((lines.add(new BigInteger("1"))).divide(new BigInteger("2")).negate());
    }
}
