package com.myspring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.myspring")
//@ComponentScan(basePackages = {"com.myspring.proxy","com.myspring.service","com.myspring.repository"})
public class ProjectConfig {
}
