package com.hackerrank.random;

import java.math.BigInteger;
import java.util.*;

/**
 * Created by manish.sharan on 20/12/14.
 */
public class SherlockSquares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numTestCases = scanner.nextLine();
        for(int i=0;i<Integer.valueOf(numTestCases);i++){
            String range = scanner.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(range," ");
            Double lower = new Double(tokenizer.nextToken());
            Double higher = new Double(tokenizer.nextToken());
            System.out.println(calculateAllSquareRoots(lower, higher));
        }
    }

    public static int calculateAllSquareRoots(Double lower, Double higher){
        double lowerSqrt = (Math.sqrt(lower));
        double lwrSqrt = Double.valueOf(String.format("%.1f",lowerSqrt));
        double higherSqrt = (Math.sqrt(higher));
        double hgrSqrt = Double.valueOf(String.format("%.1f",higherSqrt));
        double total = (int)higherSqrt-(int)lowerSqrt;
        int lowerSquareRoot = (int)lowerSqrt;
        double chkLowerPrfctSqr = lowerSquareRoot*lowerSquareRoot;
        if(chkLowerPrfctSqr==lower){
            total = total+1;
        }
        return (int)total;
    }
}
