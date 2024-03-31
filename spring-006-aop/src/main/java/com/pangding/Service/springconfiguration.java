package com.pangding.Service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.pangding.Service")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class springconfiguration {
}
