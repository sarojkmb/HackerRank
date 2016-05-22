package com.algorithm.implementation;

import java.util.Scanner;

public class CutTheStick {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int cutNum;
        while(findMin(arr)>0){
            if(findMin(arr) ==9999){
                break;
            }
            cutNum=cut(arr, findMin(arr));
            System.out.println(cutNum);
            in.close();
        }
        
    }
    
    public static int findMin(int[] arr){
            int min=9999;
            
            for(int i=0;i<arr.length;i++){
                if(arr[i]<=0){
                    continue;
                }
                if(arr[i]<min){
                    min=arr[i];
                }
            }
       // System.out.println("min: "+min);
            return min;
    }
    
    public static int cut(int[] arr, int min){
        int cutNum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                arr[i]=arr[i]-min;
                cutNum++;
            }
        }
        
        return cutNum;
    }
}
