package com.cxq.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author CXQ
 * @version 1.0
 */
public class InputStreamReaderTest {
    private static void inputStreamReader(){
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            String str;
            while ((str = bufferedReader.readLine()) != null){
                if ("exit".equals(str)){
                    break;
                }
                System.out.println(">>" + str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        inputStreamReader();
    }
}
