package com.john_pank.chapter11.task15;

import java.util.LinkedList;

/**
 * Filosofia_Java
 * Created by John Pank on 27.06.2016.
 */
public class MyStack {
    public static void main(String[] args) {
        char[] command = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---".toCharArray();
        //реализация стэка
        LinkedList<Character> stack  = new LinkedList<>();
        //заполнение стека
        for(int i = 0; i < command.length; i++ ){
            if(command[i] == '+')
                stack.push(command[i+1]);
            if(command[i] == '-')
                System.out.print(stack.pop());
        }

    }
}

