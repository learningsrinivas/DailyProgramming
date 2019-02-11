package com.srinivas.tutorialprogramming;
import java.util.Scanner;
import java.util.Stack;
class MonkandPhilospherssStone {
    @SuppressWarnings("unused")
    private static Stack<Integer> s = new  Stack<Integer>();
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int  result = -1;
        int N=sc.nextInt();
        int array[] = new int[N];
        for(int i=0;i<N;i++){
            array[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        String[] queries = new String[q];
        int x=sc.nextInt();
        for(int i=0;i<q;i++)
            queries[i]=sc.next();
        int j = -1;
        for(int i=0;i<q;i++){
            if(queries[i].equals("Harry")){
                s.push(array[++j]);
            }
            else if(queries[i].equals("Remove")){
                    s.pop();
            }
            int sum1 = s.stream().reduce(0, (a,b)->a+b);
            if(sum1 == x) {
                result = s.size();
                break;
            }
                
        }
        System.out.println(result);

    }

}
