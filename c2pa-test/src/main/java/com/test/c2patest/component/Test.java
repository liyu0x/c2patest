package com.test.c2patest.component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.cbor.databind.CBORMapper;

import java.io.*;

public class Test {

    public static void main(String[] args) {
        try(InputStream in = new BufferedInputStream(new FileInputStream("static/ex.png"))){
            ObjectMapper ob = new CBORMapper();

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
