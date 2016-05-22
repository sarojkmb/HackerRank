package com.algorithm.implementation;

import java.util.Scanner;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
           // System.out.println(n);
            int height=0;
            int i=0;
            while(i<=n){
               if(i%2==0){
                   height = height+1;
               } 
               if(i%2!=0){
                  height=height*2; 
               }
                i++;
            }
            System.out.println(height);
        }
        in.close();
    }
    
    
}
