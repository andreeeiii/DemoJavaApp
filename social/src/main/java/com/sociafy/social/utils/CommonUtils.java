package com.sociafy.social.utils;

import java.nio.charset.Charset;
import java.util.Random;

public class CommonUtils {

    public static String generateId() {
        byte[] array = new byte[16];
        new Random().nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }
}
