package com.hackerrank.random;

import java.util.Scanner;

/**
 * Created by manish.sharan on 17/12/14.
 */
public class ChocolateFest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }

    private static int Solve(int moneyAvailable, int pricePerChoco, int wrappersReqd){
        int chocosGot = moneyAvailable/pricePerChoco;
        if(chocosGot<wrappersReqd){
            return  chocosGot;
        }else if(chocosGot==wrappersReqd){
            return chocosGot+1;
        }else{
            int wrappersObtained = chocosGot;
            while(wrappersObtained>=wrappersReqd){
                chocosGot+=wrappersObtained/wrappersReqd;
                wrappersObtained=(wrappersObtained/wrappersReqd)+(wrappersObtained%wrappersReqd);
            }
            return chocosGot;
        }
    }
}
