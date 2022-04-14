package com.example.kpp;

import com.example.kpp.ThreadLogic.MultiThread;
import com.example.kpp.cache.GetCache;
import com.example.kpp.exceptionhandling.MyThrowable;
import com.example.kpp.logic.Polynom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    static Logger MyLogger = LoggerFactory.getLogger(Polynom.class);
    private GetCache getCache;
    private MultiThread MyThread;

    @Autowired
    public void SetCache(GetCache getCache){
        this.getCache = getCache;
    }
    @Autowired
    public void CreateThread(MultiThread NewThread){
        this.MyThread = NewThread;
    }



    @GetMapping(path = "/polynom")
    public String[][] WelcomMessage(@RequestParam(name="MyPath",defaultValue = "empty") String test) throws MyThrowable {

        String[][] reply = new String[3][2];
        MyThread.IncCalls();
        //checking cache
        reply = getCache.Get(test);
        if(!reply[0][0].equals("FALSE")) {
            MyLogger.info("Send info from cache");
            return reply;
        }
        reply = Polynom.is_polynom(test);
        getCache.Set(test,reply);
        return reply;
    }
    @GetMapping(path = "/Calls")
    public int ShowCalls(){
        return MyThread.AskCalls();
    }
}
