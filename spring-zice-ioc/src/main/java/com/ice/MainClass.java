package com.ice;

import com.ice.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangBin
 * @date 2020/9/24
 */
@Configuration
@ComponentScan("com.ice")
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainClass.class);
        UserServiceImpl bean = applicationContext.getBean(UserServiceImpl.class);
        bean.sayHi();
    }
}
