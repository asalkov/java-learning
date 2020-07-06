package com.ansa.simple;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StringUtilsTest {

    @Test
    public void normal(){
        int num = StringUtils.countSymbolInString("aaa", 'a');
        Assert.assertEquals(3, num);
    }

    @Test
    public void normal2(){
        int num = StringUtils.countSymbolInString("ababa", 'a');
        Assert.assertEquals(3, num);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exception(){
        int num = StringUtils.countSymbolInString(null, 'a');
        Assert.assertEquals(3, num);
    }


    ///

    @Test
    public void testTopStrings(){
        String[] inputValues = new String[] { "ABC", "TEST", "AUTOMATION", "SYSTEM" };
        List<String> input = Arrays.asList(inputValues);

        List<String> topStrings = StringUtils.getTopLongStrings(input, 3);

        Assert.assertEquals("AUTOMATION", topStrings.get(0));
        Assert.assertEquals("SYSTEM", topStrings.get(1));
        Assert.assertEquals("TEST", topStrings.get(2));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testTopStringsException(){
        List<String> topStrings = StringUtils.getTopLongStrings(null, 3);
    }


    //

    @Test
    public void testCountSymbols(){
        String input = "abcaba";
        Map<Character, Integer> map = StringUtils.countSymbols(input);

        Assert.assertEquals(3, map.get('a').intValue());
        Assert.assertEquals(2, map.get('b').intValue());
        Assert.assertEquals(1, map.get('c').intValue());
    }

}
