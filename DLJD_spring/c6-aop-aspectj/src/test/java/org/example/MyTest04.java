package org.example;

import org.example.ba04.someService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest04 {
    @Test
    public void test04(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        someService someService= (someService) ac.getBean("someServiceImpl");

        System.out.println(someService.getClass().getName());

        someService.doSecond();

    }
}
