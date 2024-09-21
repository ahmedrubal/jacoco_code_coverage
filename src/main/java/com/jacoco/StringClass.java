package com.jacoco;

public class StringClass {
    public String getStringValue(String input){
        if(input == null){
            throw new IllegalArgumentException("String can not be null");
        }else if(input.isEmpty()){
            return "Empty String";
        }else if(input.trim().isEmpty()){
            return "WhiteSpace";

        }else{

            return input.toUpperCase();
        }

    }
}
