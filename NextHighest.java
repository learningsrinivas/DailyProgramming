package com.srinivas.tutorialprogramming;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class NextHighest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
		List<Integer> digits = new ArrayList<Integer>();
		int number = scanner.nextInt();
		 
		// number is 1342
		while(number > 0 ) {
			int digit = number %  10 ; // getting  numbers in reverse from right to left.
			digits.add(digit);
			number = number / 10;
		}
		
		//digits = [2,4,3,1]
		
		// finding the index which distrubs the ascending order from right to left i.e 
		// finding the index which distrubs the ascending order in list from left to right [2,4,3,1]
		// 3 AT INDEX SWAPPOSITON
		int swapPosition = 0;	
		for(int i = 0 ; i < digits.size() -1 ; i ++ ) {
			if(digits.get(i) > digits.get(i+1)) {
				swapPosition =  i + 1;
					break;
			}
		}
		
		
		//finding the next smallest numbers greater than element at swapPositon 
		// [1,3,4,2] the next smallest numbers greater than element at swapPositon from left to right  after swapOsiton is 4
		//[2,4,3,1] which means in list the next smallest numbers greater than element swapPositon from right to left  befor swappositon  is 4
		int nextMinNumGtSwapPosition = swapPosition - 1;
		for(int i1 = swapPosition - 2; i1 >= 0; i1-- ) {
			if(digits.get(i1) > digits.get(swapPosition) && digits.get(i1) < digits.get(nextMinNumGtSwapPosition )) {
			    nextMinNumGtSwapPosition = i1;
			}
		}

		//swappPositonelement = 3
		//nextMinNumGtSwapPosition =4
		// swap swapPositon element and nextMinNumGtThree
	
		int temp = digits.get(swapPosition);
		digits.set(swapPosition,digits.get(nextMinNumGtSwapPosition));
		digits.set(nextMinNumGtSwapPosition,temp);
	
		// sort the elements afte the original swappositon in number [1,4,3,2]sorting from 3 to 2
		//[2,3,4,1]
        // in list sort from 3 to 2
		List<Integer> subList = digits.subList(0,swapPosition);
		
		

		for(int i1=digits.size()-1;i1>=swapPosition;i1--) {
		    System.out.print(digits.get(i1));
		}

		
		Collections.sort(subList);
		subList.forEach(System.out::print);
		
		
		
		  System.out.println();
	
	
	}
}

		