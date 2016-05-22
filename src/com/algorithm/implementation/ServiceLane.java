package com.algorithm.implementation;

import java.util.Scanner;

public class ServiceLane {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++){
            int i = in.nextInt();
            int j = in.nextInt();
            int min=3;
            for(int count=i;count<=j;count++){
                if(width[count]<min){
                    min=width[count];
                }
            }
            System.out.println(min);
        }
        in.close();
    }
}

