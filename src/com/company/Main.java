package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("Scores"));
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> newwords = new ArrayList<>();
        String lineJustFetched=null;
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
        for(int i = 0;i<words.size();i++){
            wordsArray=words.get(i).split("\\+");
            if(wordsArray.length==0){
                newwords.add(wordsArray[0].trim());
            }
            else{
                for(int j =0;j<wordsArray.length;j++){
                    newwords.add(wordsArray[j].trim());
                }
            }
        }
        for(int i = 0;i<newwords.size();i++){
            
        }

        for(String each : newwords){
            System.out.println(each);
        }

        br.close();
    }
}
