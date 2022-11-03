package com.me.mylog;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyLogProjectApplication.class)
public class ApplicationTests {

    private Logger logger = Logger.getLogger(getClass());

//    Spring boot中使用log4j记录日志
//    https://blog.csdn.net/chengqiuming/article/details/83686430

//    Log4j.properties配置详解
//    https://www.jianshu.com/p/ccafda45bcea
    @Test
    public void test() throws Exception {
        logger.info("输出info");
        logger.debug("输出debug");
        logger.error("输出error");
    }
}
