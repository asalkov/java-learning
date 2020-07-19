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
        Map<Character,Integer> charCounter=new HashMap<Character,Integer>();
        int count=0;
        char[]char_array =input.toCharArray();


        for(char ch: char_array)
        {
            if(charCounter.containsKey(ch))
            {
                charCounter.put(ch, charCounter.get(ch)+1);

            }
            else
            {
                charCounter.put(ch, 1);
            }
        }


        return charCounter;
    }

    public static List<String> getTopLongStrings(List<String> input, int topNumber){
        return new ArrayList<>();
    }
}
