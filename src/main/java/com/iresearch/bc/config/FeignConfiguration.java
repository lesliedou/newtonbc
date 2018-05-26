package com.iresearch.bc.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.iresearch.bc")
public class FeignConfiguration {

}
