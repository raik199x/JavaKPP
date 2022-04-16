package com.example.kpp.ThreadLogic;

public class RequestCounter {
    static int CountRequests = 0;

    public static void IncCounter(){
        CountRequests++;
    }
    public static int AskCounter(){
        return CountRequests;
    }
}
