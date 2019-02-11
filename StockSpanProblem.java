package com.srinivas.tutorialprogramming;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {

	public static void main(String[] args) {
	
		int price[] = {10, 4, 5, 90, 120, 80};
        int n = price.length;
        int S[]= new int[n];
         
        // Fill the span values in array S[]
        calculateSpan(price, n, S); 
         
        // print the calculated span values
        printArray(S);

	}

	private static void printArray(int[] s) {
		
		System.out.println(Arrays.toString(s));
	}

	private static void calculateSpan(int[] price, int n, int[] s) {
		Stack<Integer> st = new Stack<>();
		// adding indexes(span) to the stack
		
		// Prerequisite
		st.push(0);
		
		for(int i=1;i<n;i++) {
			
			//pop the indexes of elements less than current element
			while(!st.isEmpty() && price[st.peek()]<price[i])
							st.pop();
			
			//if stack is empty means current element is maximum of all elements to its left side
			s[i]=st.isEmpty()?i+1:i-st.peek();
			
			// current index to the stack from the pop should happen for the next iteration.
			st.push(i);
			
		}
		
	}

}
