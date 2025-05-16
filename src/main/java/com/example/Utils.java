package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {
    /**
     * Returns a map of Scrabble letter scores.
     * E.g. 'A' -> 1, 'B' -> 3, 'Q' -> 10, etc.
     */
    public static Map<Character, Integer> getScoreMap() {
        Map<Character, Integer> map = new HashMap<>();
        String one = "EAIONRTLSU";
        String two = "DG";
        String three = "BCMP";
        String four = "FHVWY";
        String five = "K";
        String eight = "JX";
        String ten = "QZ";
        for (char c : one.toCharArray()) map.put(c, 1);
        for (char c : two.toCharArray()) map.put(c, 2);
        for (char c : three.toCharArray()) map.put(c, 3);
        for (char c : four.toCharArray()) map.put(c, 4);
        for (char c : five.toCharArray()) map.put(c, 5);
        for (char c : eight.toCharArray()) map.put(c, 8);
        for (char c : ten.toCharArray()) map.put(c, 10);
        return map;
    }

    /**
     * Returns a map of Scrabble tile distribution.
     * E.g. 'E' -> 12, 'A' -> 9, 'Z' -> 1, etc.
     */
    public static Map<Character, Integer> getDistributionMap() {
        Map<Character, Integer> dist = new HashMap<>();
        dist.put('E', 12);
        dist.put('A', 9);
        dist.put('I', 9);
        dist.put('O', 8);
        dist.put('N', 6);
        dist.put('R', 6);
        dist.put('T', 6);
        dist.put('L', 4);
        dist.put('S', 4);
        dist.put('U', 4);
        dist.put('D', 4);
        dist.put('G', 3);
        for (char c : "BCMPFHVWY".toCharArray()) dist.put(c, 2);
        for (char c : "KJXQZ".toCharArray()) dist.put(c, 1);

        return dist;
    }

    public static char[] getEnglishAlphabet() {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }
}
