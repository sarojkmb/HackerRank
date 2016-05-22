package com.algorithm.implementation;



import java.util.Scanner;

public class ChocolateFeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            
            int noOfChocs=noOfChocs(n,c);
            int total=noOfChocs+wrapper(noOfChocs,m);
            System.out.println(total);
        }
        in.close();
    }
    
    public static int wrapper(int N, int M){
        int count=0;
        while((N/M)>0){
          count+=N/M;
          N=N/M+N%M;
        }
        return count;
    }
    
    public static int noOfChocs(int n,int c){
        return n/c;
    }
}