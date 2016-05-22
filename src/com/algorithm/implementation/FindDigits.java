package com.algorithm.implementation;

import java.util.Scanner;

public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            
            int n = in.nextInt();
            if(n<10){
                System.out.println(1);
            }
            int rem;
            int num=n;
            int count=0;
            do{
               rem=num%10;
                if(rem!=0 && n%rem==0){
                     count++;
                 }
                num=num/10;
               
            } while(num>0);
            System.out.println(count++);
        }
        in.close();
    }
}