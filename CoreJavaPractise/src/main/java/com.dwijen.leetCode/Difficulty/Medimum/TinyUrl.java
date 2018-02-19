package com.dwijen.leetCode.Difficulty.Medimum;

import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

public class TinyUrl {
    Map<Integer, String> map = new HashMap<>();
    public String encode(String longUrl) {
        map.put(longUrl.hashCode(), longUrl);
        return "http://tinyurl.com/"+longUrl.hashCode();
    }

    public String decode(String shortUrl){
        return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
    }

    @Test
    public void test(){
        System.out.println(encode("xyz12345?test=1&test#1222%%%12345***andtest"));
        System.out.println(decode(encode("http://tinyurl.com/xyz12345?test=1&test#1222%%%12345***andtest")));
    }

}
