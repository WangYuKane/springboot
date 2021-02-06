package com.xpwi.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName springboot
 * @Author Y.Wang
 * @Create 2021/2/5 10:33
 * @Describe
 */

@RestController
@RequestMapping("/git")
public class GitTestController {
    @RequestMapping("/editthird")
    public String gittest(){
        return "This is edit by git";
    }
}
