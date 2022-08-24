package com.primus.primus.Controller;

import com.configcat.ConfigCatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired
    ConfigCatClient configCatClient;

    @GetMapping(value = "api/featureflag")
    public String getFeatureFlag(){
        boolean isFeatureEnable = configCatClient
                .getValue(Boolean.class,"isMyFirstFeatureEnabled",false);

        if(isFeatureEnable){
            System.out.println("Feature Flag is ON \uD83D\uDE00 ");
        }
        else{
            System.out.println("Feature Flag is OFF \uD83D\uDE14");
        }
        return "isFeatureEnable : " + isFeatureEnable;
    }
}
