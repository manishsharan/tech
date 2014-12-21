package com.hackerrank.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by manish.sharan on 22/12/14.
 */
public class AngryChildren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPackets = Integer.parseInt(scanner.nextLine());
        int packetsToSelect = (Integer.parseInt(scanner.nextLine()));
        List<Integer> values = new ArrayList<Integer>();
        for(int i=0;i<totalPackets;i++){
            values.add(Integer.parseInt(scanner.nextLine()));
        }
        Collections.sort(values);
        int minUnfairness = Integer.MAX_VALUE;
        for(int i=0;i<totalPackets-packetsToSelect;i++){
            int diff = values.get(i+packetsToSelect-1)-values.get(i);
            if(diff<minUnfairness){
                minUnfairness = diff;
            }
        }
        System.out.println(minUnfairness);
    }
}
