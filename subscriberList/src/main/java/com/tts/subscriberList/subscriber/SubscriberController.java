package com.tts.subscriberList.subscriber;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//connect template browser and database
@Controller
public class SubscriberController {
    @GetMapping
    public String index(Subscriber subscriber){
        //where we are going when app starts
        return "subscriber/index";
    }
}
