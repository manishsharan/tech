package com.hackerrank.Array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by manish.sharan on 25/12/14.
 */
public class HasArrayTwoCandidates {
    public static void main(String[] args) {
        int[] array = {-8, 1, 4, 6, 10, 45,24};
        int sum = 16;

        Map<Integer,Integer> numMap = new HashMap<Integer,Integer>();

        for(int i=0;i<array.length;i++){
            if(numMap.containsKey(array[i])){
                int count = numMap.get(array[i]);
                numMap.put(array[i],count+1);
            }else{
                numMap.put(array[i],1);
            }
        }

        for(int i=0;i<array.length;i++) {
            if(array[i]>0){
                if (array[i] < sum) {
                    if (numMap.containsKey(sum - array[i])) {
                        System.out.println(array[i] + " " + (sum - array[i]));
                    }
                } else {
                    if (numMap.containsKey(array[i] - sum)) {
                        System.out.println(array[i]+" "+(array[i]-sum));
                    }
                }
            }else{
                if(numMap.containsKey(sum-array[i])){
                    System.out.println(array[i]+" "+(sum-array[i]));
                }
            }
        }
    }
}
