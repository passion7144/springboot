package cn.wmyskxz.springboot;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*Spring Boot 项目通常有一个名为 *Application 的入口类，入口类里有一个 main 方法， 这个 main 方法其实就是一个标准的 Javay 应用的入口方法。*/

//@SpringBootApplication===@Configuration、@EnableAutoConfiguration、@ComponentScan
//@EnableAutoConfiguration 让 Spring Boot 根据类路径中的 jar 包依赖为当前项目进行自动配置，
// 例如，添加了 spring-boot-starter-web 依赖，会自动添加 Tomcat 和 Spring MVC 的依赖，那么 Spring Boot 会对 Tomcat 和 Spring MVC 进行自动配置。
//pring Boot 还会自动扫描 @SpringBootApplication 所在类的同级包以及下级包里的 Bean ，所以入口类建议就配置在 grounpID + arctifactID 组合的包名下（这里为 cn.wmyskxz.springboot 包）

@EnableSwagger2Doc
@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
//运⾏ SpringBoot 有哪⼏种⽅式？
//打包⽤命令或者放到容器中运⾏。 ⽤ Maven/Gradle 插件运⾏。
//直接执⾏ main ⽅法运⾏。

//SpringBoot ⽀持 Java Util Logging，Log4j2，Logback 作为⽇志框架，如果你使⽤ Starters 启动器，SpringBoot 将使⽤ Logback 作为默认框架。

//⽤ Maven/Gradle 插件运⾏。可运行thtmeleaf与jsp同时存在的jsp，