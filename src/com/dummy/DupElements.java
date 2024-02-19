package com.dummy;

import java.util.HashMap;
import java.util.Map;

public class DupElements {
    public static void countdup(String str){
        Map<Character,Integer> map = new HashMap<>();
        char [] charArray = str.toCharArray();
        //Converted to CHar Array

        for(char c : charArray){
            // if char is present in map increment the count value by 1
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                //Char not present then map with value as 1
                map.put(c,1);
        }
        //Traverse the hashmap to check the count of char is more than 1
        //then print that char with occurence
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String message = "mississippi";
        countdup(message);
    }

}
