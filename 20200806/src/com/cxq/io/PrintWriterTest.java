package com.cxq.io;

import java.io.*;
import java.util.Date;

/**
 * @author CXQ
 * @version 1.0
 */
public class PrintWriterTest {
    private static void printWriter(){
        String filePath = "D:" + File.separator + "idea2018" + File.separator + "idea"+ File.separator + "my-log.log";
        try ( BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
              PrintWriter printWriter = new PrintWriter(new FileWriter(filePath,true),true)){

            String str = null;
            while ((str = bufferedReader.readLine()) != null){
                if ("exit".equalsIgnoreCase(str)){
                    break;
                }
                printWriter.println(str);
            }
            printWriter.println("Time is " + new Date());
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        printWriter();
    }
}
