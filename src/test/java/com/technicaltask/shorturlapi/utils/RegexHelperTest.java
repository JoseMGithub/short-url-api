package com.technicaltask.shorturlapi.utils;

import com.technicaltask.shorturlapi.utils.RegexHelper;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegexHelperTest {

    @Test
    void filterPunctuation() {

        ArrayList<String> result = RegexHelper.wordsFilters("Dorothy, dorothy? saw! a; creature: which terrified her.");

        assertEquals( "dorothy" , result.get(0));
        assertEquals( "dorothy" , result.get(1));
        assertEquals( "saw" , result.get(2));
        assertEquals( "a" , result.get(3));
        assertEquals( "creature" , result.get(4));
        assertEquals( "which" , result.get(5));
        assertEquals( "terrified" , result.get(6));
        assertEquals( "her" , result.get(7));

    }

    @Test
    void includingSingleHyphen() {

        ArrayList<String> result = RegexHelper.wordsFilters("Dorothy, dorothy noIncluded--bird quasi-bird her.");

        assertEquals( "dorothy" , result.get(0));
        assertEquals( "dorothy" , result.get(1));
        assertEquals( "quasi-bird" , result.get(2));
        assertEquals( "her" , result.get(3));
    }
}
