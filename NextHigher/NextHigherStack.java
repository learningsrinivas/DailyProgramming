package com.srinivas.tutorialprogramming.NextHigher;

import java.util.Stack;

public class NextHigherStack {
    public static void main(String[] args) {
        int arr[] = {11,12,21,3};
        int n =arr.length;
        printNGE(arr,n);
    }

    private static void printNGE(int[] arr, int n) {
        int element;
        int next;
        Stack<Integer> s = new Stack<>();
        //push first element to the stack
        s.push(arr[0]);

        for(int i=1;i<n;i++){
              next = arr[i];

             if(!s.isEmpty()){
                   element = s.pop();


                  while(element < next){
                      System.out.println(element+"---->"+next);
                      if(!s.isEmpty()){
                          break;
                      }
                      element = s.pop();
                  }

                  if(element > next){
                      s.push(element);
                  }
             }
             s.push(next);
        }

        while(!s.isEmpty()){
            element = s.pop();
            next = -1;
            System.out.println(element+"---->"+next);
        }
    }
}
