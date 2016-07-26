package com.dream.real.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Desc:     服务启动就执行的类
 * Author:   licheng
 * Datetime: 2016-07-26 15:02
 * @see CommandLineRunner
 */
@Component
@Order(value = 2) // @Order 注解的执行优先级是按value值从小到大顺序
public class StartRunner2 implements CommandLineRunner {

    protected final Logger logger = LoggerFactory.getLogger(StartRunner2.class);

    @Override
    public void run(String... args) throws Exception {

        logger.info("licheng");
    }
}
