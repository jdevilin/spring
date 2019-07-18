package com.org.springaopbefore.springaopbefore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.org.springaopbefore.springaopbefore")
public class DataConfig {

}
