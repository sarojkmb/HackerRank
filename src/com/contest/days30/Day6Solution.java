package com.contest.days30;

import java.util.Scanner;

public class Day6Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        //System.out.println(n);
        for(int i=0; i<n;i++){
            String s=in.nextLine(); 
            int len=s.length();
            String first=new String();
            String second=new String();
            char[] charArray=new char[len];
            charArray=s.toCharArray();
            for(int j=0;j<len;j++){
                if(j%2==0){
                    first=first+charArray[j];
                }else{
                    second=second+charArray[j];
                }
            }
            System.out.println(first+" "+second);
        }
        in.close();
    }
}
