package com.xpwi.springboot;

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

    @RequestMapping("/first")
    public String first(){
        return "This is the first SpringBoot";
    }
}
