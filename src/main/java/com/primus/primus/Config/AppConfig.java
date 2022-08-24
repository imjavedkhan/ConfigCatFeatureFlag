package com.primus.primus.Config;

import com.configcat.ConfigCatClient;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    public ConfigCatClient configCatClient(){
        return ConfigCatClient.newBuilder().build("ScjZCHC7nE-HInm60zKy3w/IF-jMFyoBkWADOD-6dOMLA");
    }

}
