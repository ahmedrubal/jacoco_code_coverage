package com.jacoco;

public class Messages {
    public String getMessage(String name){
        StringBuilder s = new StringBuilder();
        if(name==null || name.trim().length()==0){
            s=s.append("name is provided");
        }else{
            s.append(name);
        }
        return s.toString();
    }
}
