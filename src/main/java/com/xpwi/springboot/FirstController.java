package com.xpwi.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName springboot
 * @Author Y.Wang
 * @Create 2021/2/5 9:40
 * @Describe
 */

@RestController
public class FirstController {

    @Value("${name}")
    String name;

    @Value("${vueUrl}")
    String vueUrl;

    @Autowired
    private author author;

    @RequestMapping("/third")
    public String first() {
        return "This is the first SpringBoot,and edit by wang third";
    }

    @RequestMapping("/author")
    public String author() {
        return "Name:" + author.getName() + " vueUrl: " + author.getVueUrl()+ "\n\r"
               + "Name:" + name + " vueUrl: " + vueUrl;
    }
}
