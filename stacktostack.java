package com.srinivas.tutorialprogramming;

import java.util.ArrayDeque;
import java.util.Stack;

public class stacktostack {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        System.out.println(s);
        Stack<Integer> l =s;
        System.out.println(l);
        s.pop();
        System.out.println(s);
        System.out.println(l);
        l.add(10);
        System.out.println(s);
        l.push(11);
        System.out.println(s);
        l.pop();
        System.out.println(s);
    }
}
