package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
        Scanner one = new Scanner(new File("Scores"));
        ArrayList<String> words = new ArrayList<>();
        String lineJustFetched;
        String[] wordsArray;
        one.nextLine();
        while(one.hasNextLine()){
            lineJustFetched = one.nextLine();
                wordsArray = lineJustFetched.split("\t");
                for(String each : wordsArray){
                    if(!"".equals(each)){
                        words.add(each);
                    }
                }

        }
        for(int i = 0;i<words.size();i++){
            if(words.get(i).contains("+")){
            
            }
        }

        for(String each : words){
            System.out.println(each);
        }
        one.close();
    }
}
