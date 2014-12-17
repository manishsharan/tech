package com.hackerrank.random;

import java.util.Scanner;

/**
 * Created by manish.sharan on 17/12/14.
 */
public class UtopianTree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String testCaseNum = scanner.nextLine();
        for(int i=0;i<Integer.valueOf(testCaseNum);i++){
            String seasons = scanner.nextLine();
            //System.out.println(findHeight(Integer.valueOf(seasons)));
            System.out.println(findHeightFormula(Integer.valueOf(seasons)));
        }
    }

    public static int findHeight(int numSeasons){
        int height = 1;
        if(numSeasons==0) return 1;
        int count = 1;
        while(count<=numSeasons){
            if(count%2!=0){
                height = springOperation(height);
            }else{
                height = summerOperation(height);
            }
            count++;
        }
        return height;
    }

    private static int springOperation(int height){
        return height*2;
    }

    private static int summerOperation(int height){
        return height+1;
    }

    public static int findHeightFormula(int numSeasons){
        double height = 1;
        if(numSeasons>0) {
            if (numSeasons % 2 == 0) height = calcHeight(numSeasons);
            else height = calcHeight(numSeasons+1)-1;
        }
        return (int)height;
    }

    private static int calcHeight(int numSeasons){
        int remainder = numSeasons/2;
        return (int)Math.pow(2, (remainder + 1)) - 1;
    }
}
