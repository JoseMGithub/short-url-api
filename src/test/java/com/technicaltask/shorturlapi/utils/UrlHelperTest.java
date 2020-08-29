package com.technicaltask.shorturlapi.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UrlHelperTest {
    @Test
    void isURLValid() {

        Boolean result = URLHelper.urlValidator("http://www.google.com");

        Assertions.assertTrue( result);
    }

    @Test
    void isURLNoValid() {

        Boolean result = URLHelper.urlValidator("http?://www.google.com");

        Assertions.assertFalse( result);
    }
}
