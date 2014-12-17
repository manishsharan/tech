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
        int directBuy = moneyAvailable/pricePerChoco;
        if(directBuy<wrappersReqd){
            return  directBuy;
        }else if(directBuy==wrappersReqd){
            return directBuy+1;
        }else{
            if((directBuy / wrappersReqd)%2==0) {
                return directBuy + (directBuy / wrappersReqd);
            }else{
               return directBuy + (directBuy / wrappersReqd)+((directBuy / wrappersReqd)+1)/wrappersReqd;
            }
        }
    }
}
