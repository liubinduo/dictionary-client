package com.v1ok.dictionary;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.v1ok.dictionary")
@EnableFeignClients(basePackages = "com.v1ok.dictionary.client")
public class DictionaryServiceConfig {

}
