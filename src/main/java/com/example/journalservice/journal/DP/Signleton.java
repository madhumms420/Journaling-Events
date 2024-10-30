package com.example.journalservice.journal.DP;

public class Signleton {
    private static  Signleton instance;
    private  Signleton(){
    }
    public static Signleton getInstance(){
        if(instance==null){
         return  instance=new Signleton();
        }
        else{
            return instance;
        }
    }
}
