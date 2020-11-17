package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestApplication {
    public static void main(String[] args) {
        /*
        * 思考题？ 怎样将RestTemplate注入
        */
        SpringApplication.run(RestApplication.class,args);
    }
    /*Spring帮助我们管理Bean分为两个部分，一个是注册Bean，一个装配Bean。
    完成这两个动作有三种方式，一种是使用自动配置的方式、一种是使用JavaConfig的方式，一种就是使用XML配置的方式。
    在自动配置的方式中，使用@Component去告诉Spring，我是一个bean，你要来管理我，然后使用@AutoWired注解去装配Bean(所谓装配，就是管理对象直接的协作关系)。
    然后在JavaConfig中，@Configuration其实就是告诉spring，spring容器要怎么配置（怎么去注册bean，怎么去处理bean之间的关系（装配））。
    那么久很好理解了，@Bean的意思就是，我要获取这个bean的时候，你spring要按照这种方式去帮我获取到这个bean。
    */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
