package com.technicaltask.shorturlapi.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class RegexHelper {
    private static Logger LOGGER = LoggerFactory.getLogger(RegexHelper.class);

    public static ArrayList<String> wordsFilters(String line){

        ArrayList<String> wordList = new ArrayList();
        LOGGER.debug("Line processed " + line);
        //  " \t\n\r\f,.:;?![]'"
        //Excluding punctuations from each token
        StringTokenizer st = new StringTokenizer(line, " ,.:;?!");

        while(st.hasMoreTokens()){

            String tmp = st.nextToken().toLowerCase();
            //Allow words lowcase and words including a single hyphen
            if (Pattern.matches("\\p{Lower}+|([\\p{Lower}]+)-([\\p{Lower}]+)", tmp))
                wordList.add(tmp);
        }

        return wordList;
    }
}
