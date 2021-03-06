package cn.wmyskxz.springboot.controller;

import cn.wmyskxz.springboot.entity.StudentProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

/**
 * 测试控制器
 *
 * @author: @我没有三颗心脏
 * @create: 2018-05-08-下午 16:46
 */
@RestController//@Controller 和 @ResponseBody 注解的合体版
public class HelloController {
    @Value("${name}")//SpringBoot 可以通过@PropertySource，@Value，@Environment，@ConfigurationProperties 绑定变量
    private String name;//我们并没有在 yml 文件中注明属性的类型，而是在使用的时候定义的。

    @Value("${age}")
    private Integer age;

    @Value("${content}")// 这样写配置文件繁琐而且可能会造成类的臃肿，因为有许许多多的 @Value 注解,我们可以把配置信息封装成一个类
    private String content;

    @Autowired
    private StudentProperties studentProperties;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!"+name+age+content+studentProperties.getName()+studentProperties.getAge();
    }
}
