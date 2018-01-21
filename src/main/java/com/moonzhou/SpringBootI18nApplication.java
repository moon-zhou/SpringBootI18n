package com.moonzhou;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 等同于 @Configuration @EnableAutoConfiguration @ComponentScanpublic
 * 
 * @author 17080118
 *
 */
@SpringBootApplication()
public class SpringBootI18nApplication {

    public static void main(String[] args) {
        /*
         * Banner.Mode.OFF:关闭; Banner.Mode.CONSOLE:控制台输出，默认方式; Banner.Mode.LOG:日志输出方式;
         * 
         * 或者在application.properties进行配置
         * 在application.proerpties进行banner的显示和关闭：spring.main.show-banner=false
         */
        /*SpringApplication application = new SpringApplication(SpringBootI18nApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);*/

        SpringApplication.run(SpringBootI18nApplication.class, args);
    }
}
