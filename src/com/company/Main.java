package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("Scores"));
        ArrayList<String> words = new ArrayList<>();
        String lineJustFetched = null;
        String[] wordsArray;
        br.readLine();
        while(true){
            lineJustFetched = br.readLine();
            if(lineJustFetched == null){
                break;
            }else{
                wordsArray = lineJustFetched.split("\t");
                for(String each : wordsArray){
                    if(!"".equals(each)){
                        words.add(each);
                    }
                }
            }
        }

        for(String each : words){
            System.out.println(each);
        }

        br.close();
    }
}
