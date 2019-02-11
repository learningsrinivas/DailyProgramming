
package com.srinivas.tutorialprogramming;

import java.util.Scanner;

public class IndexMapping {

    public static void main(String[] args) {
         @SuppressWarnings("resource")
         Scanner scanner = new Scanner(System.in);
         System.out.println("please enter  max");
         int Max = scanner.nextInt();
         System.out.println("elements are in the range between -"+Max+" and "+Max);
         int arr[] = new int[5];
         System.out.println("please enter 5 elements");
         for(int i=0;i<5;i++) {
             arr[i]=scanner.nextInt();
         }
         int searchMatrix[][] = new int[Max+1][2];
         for(int n  : arr)
         {
             if (n>=0) {  
                 searchMatrix[n][0] = 1;
             }
             else {
                 searchMatrix[Math.abs(n)][1]=0;
             }
         }
         
         
         System.out.println("please enter number to search");
         
         int x = scanner.nextInt();
         
     
         if(x > 0) {
             if(searchMatrix[x][0]==1)
                 System.out.println("element is present");
             else
                 System.out.println("element is not present");
         }
         else {
             if(searchMatrix[Math.abs(x)][1]==1) {
                 System.out.println("elements is present");
             }
             else {
                 System.out.println("element is not present");
             }
         }
    }

}
