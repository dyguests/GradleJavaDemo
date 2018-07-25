package com.fanhl.gradledemo;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "开心一下下";
        byte[] bytes = str.getBytes("gbk");
        String newS = new String(bytes, Charset.forName("GB18030"));
        System.out.println(newS.length());
    }
}
