package com.hackerrank.search;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by manish.sharan on 17/12/14.
 */
public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer valueToBeSearched = Integer.valueOf(scanner.nextLine());
        Integer arraySize = Integer.valueOf(scanner.nextLine());
        String array = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(array," ");
        Integer[] numbers = new Integer[tokenizer.countTokens()];
        int count = 0;
        while(tokenizer.hasMoreTokens()){
            numbers[count]=Integer.valueOf(tokenizer.nextToken());
            count++;
        }

        System.out.println(binarySearch(0,count,valueToBeSearched,numbers));
    }

    public static int binarySearch(Integer low,Integer high, Integer valueToBeSearched, Integer[] numbers){
        int result = -1;
        int middle = (low+high)/2;
        if(numbers[middle] == valueToBeSearched){
            result = (low+high)/2;
            return result;
        }
        else if(valueToBeSearched>numbers[middle]){
            result = binarySearch(middle+1,high,valueToBeSearched,numbers);
        }else{
            result = binarySearch(low,middle,valueToBeSearched,numbers);
        }
        return result;
    }
}
