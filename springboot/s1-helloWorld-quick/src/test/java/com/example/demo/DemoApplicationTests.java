package com.example.demo;


import com.example.demo.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * springboot 的单元测试
 * <p>
 * -@RunWith(SpringRunner.class)表示使用spring的驱动器来运行
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    Person person;
    @Autowired
    ApplicationContext ac;

    @Test
    public void Test01() {
        System.out.println(ac.containsBean("helloService"));
    }

    @Test
    void contextLoads() {
        //
        System.out.println(person);
    }

}
