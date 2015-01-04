package com.hackerrank.Array;

import java.util.*;

/**
 * Created by manish.sharan on 31/12/14.
 */
public class SherlockWatson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(input," ");
        int charLength = Integer.valueOf(tokenizer.nextToken());
        int numRotations = Integer.valueOf(tokenizer.nextToken());
        int numTestCases = Integer.valueOf(tokenizer.nextToken());
        String array = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(array," ");
        List<Integer> myList = new LinkedList<Integer>();
        while(stringTokenizer.hasMoreTokens()){
            myList.add(Integer.valueOf(stringTokenizer.nextToken()));
        }
        for(int i=0;i<numTestCases;i++){
            int inputIndex = Integer.valueOf(scanner.nextLine());
            System.out.println(myList.get((inputIndex + numRotations) % myList.size()-1));
        }
    }
}
