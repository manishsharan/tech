package com.hackerrank.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by manish.sharan on 16/12/14.
 */
public class LinearSearch {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(input,",");
        List<Integer> numberList = new ArrayList<Integer>();
        while(tokenizer.hasMoreTokens()){
            numberList.add(Integer.valueOf(tokenizer.nextToken()));
        }
        linearSearch(numberList,15);
    }

    public static void linearSearch(List<Integer> numberList, Integer number){
        for(int i=0;i<numberList.size();i++){
            if(numberList.get(i)==number){
                System.out.println("Found at location"+(i+1));
                break;
            }
        }
    }
}
