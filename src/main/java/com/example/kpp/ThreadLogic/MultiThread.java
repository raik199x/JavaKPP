package com.example.kpp.ThreadLogic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MultiThread extends Thread{
    static Logger MyLogger = LoggerFactory.getLogger(MultiThread.class);
    public int Calls = 0;

    public synchronized void IncCalls(){
        Calls +=1;
    }
    public synchronized  int AskCalls(){
        return Calls;
    }
    @Override
    public synchronized void run(){ //Is it should work?
        IncCalls();
        MyLogger.info("IncCalls was implemented");
    }
}
