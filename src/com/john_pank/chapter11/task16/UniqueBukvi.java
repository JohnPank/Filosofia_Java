package com.john_pank.chapter11.task16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * Filosofia_Java
 * Created by John Pank on 28.06.2016.
 */
public class UniqueBukvi {
    public static void main(String[] args) throws IOException {
        String text;
        char[] characters;
        HashSet<Character> charactersSet = new HashSet<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        text = reader.readLine();
        characters = text.toCharArray();
        for(char c : characters){
            charactersSet.add(c);
        }
        System.out.println(charactersSet);
    }
}
