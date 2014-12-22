package com.hackerrank.random;

import java.util.*;

/**
 * Created by manish.sharan on 22/12/14.
 */
public class ManasaStones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseNum = Integer.valueOf(scanner.nextLine());
        for(int i=0;i<testCaseNum;i++){
            int numStones = Integer.valueOf(scanner.nextLine());
            int a = Integer.valueOf(scanner.nextLine());
            int b = Integer.valueOf(scanner.nextLine());
            Set<Integer> elementSet = new HashSet<Integer>();
            for(int j=0;j<numStones;j++){
                elementSet.add((a*(numStones-j-1))+(b*j));
            }
            List<Integer> elements = new ArrayList<Integer>(elementSet);
            Collections.sort(elements);
            for(int k=0;k<elements.size();k++){
                System.out.print(elements.get(k)+" ");
            };
            System.out.println();
        }
    }
}
