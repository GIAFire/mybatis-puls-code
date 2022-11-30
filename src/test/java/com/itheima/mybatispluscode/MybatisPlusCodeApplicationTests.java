package com.itheima.mybatispluscode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;

// @SpringBootTest
class MybatisPlusCodeApplicationTests {

    @Test
    void contextLoads() {
        SimpleDateFormat simpleDateFormat  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
        String format = simpleDateFormat.format(System.currentTimeMillis());
        System.out.println(format);
    }

}
