package com.ansa.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringUtils {

    public static int countSymbolInString(String input, char ch) {
        if (input==null){
            throw new IllegalArgumentException();

        }
        int count=0;
        for (int index=0;index<input.length();index++){
            if (input.charAt(index)==ch){
                count++;
            }
        }

        //implementation here
        return count;
    }

    public static Map<Character, Integer> countSymbols(String input){
        return new HashMap<>();
    }

    public static List<String> getTopLongStrings(List<String> input, int topNumber){
        return new ArrayList<>();
    }
}
