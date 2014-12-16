package com.hackerrank.random;

import java.util.*;

/**
 * Created by manish.sharan on 16/12/14.
 */
public class MaxXOR {

    static int maxXor(int l, int r) {
        Set<String> maxXORSet = new HashSet<String>();
        int maxVal = 0;
        for(int i=l;i<r;i++){
            for(int j=i;j<r;j++){
                if(maxVal<(j^(j+1))){
                    maxVal = j^(j+1);
                    maxXORSet.clear();
                    maxXORSet.add(i+","+j);
                }
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());

        int _r;
        _r = Integer.parseInt(in.nextLine());

        res = maxXor(_l, _r);
        System.out.println(res);

    }
}
