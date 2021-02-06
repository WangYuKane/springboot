package com.xpwi.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

/**
 * @ProjectName springboot
 * @Author Y.Wang
 * @Create 2021/2/6 15:10
 * @Describe
 */
@Controller
public class JspController {
    @Value("${application.hello:Wangyu:nono}")
    private String hello = "wang:hello jsp";

    @RequestMapping(value = {"/", "/index"})
    public String index(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.hello);
        return "index";
    }

    /**
     * （方法一）
     * 响应到JSP页面page1
     */
    @RequestMapping("/page1")
    public ModelAndView page1() {
        // 页面位置 /WEB-INF/views/page1.jsp
        ModelAndView mav = new ModelAndView("page1");
        mav.addObject("content", hello);
        return mav;
    }

    /**
     * （方法二）
     * 响应到JSP页面page1（可以直接使用Model封装内容，直接返回页面字符串）
     * 浏览器地址栏使用 page2
     */
    @RequestMapping("/page2")
    public String page2(Model model) {
        // 页面位置 /WEB-INF/views/page1.jsp
        model.addAttribute("content", hello + "（第二种）");
        return "page1";
    }

    /**
     * （方法三）
     * 參考index的寫法
     * 浏览器地址栏使用 page3
     */
    @RequestMapping("/page3")
    public String page3(Map<String, Object> model) {
        // 页面位置 /WEB-INF/views/page1.jsp
        model.put("content", hello + "（第三种）");
        return "page1";
    }
}
