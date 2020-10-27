package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class FirstController {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("message","欢迎吴海观看");

        User user = new User();
        user.setId(1L);
        user.setName("吴海");
        user.setAge(100);
        model.addAttribute("user",user);

        Map map = new HashMap();
        map.put("id","2");
        map.put("name","香慧");
        map.put("age",99);
        model.addAttribute("map",map);
        return "index";  //返回值为跳转页面   默认全是HTML可以省略
    }


    @RequestMapping("/sec")
    public String secendPage(Model model){
        User user1 = new User();
        user1.setId(1L);
        user1.setName("吴海1");
        user1.setAge(101);

        User user2 = new User();
        user2.setId(2L);
        user2.setName("吴海2");
        user2.setAge(102);

        User user3 = new User();
        user3.setId(3L);
        user3.setName("吴海3");
        user3.setAge(103);

        List list = new ArrayList();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        model.addAttribute("list",list);
        return "index2";
    }
    @RequestMapping("/index3")
    public String index3(Model model){
        model.addAttribute("message","hello  thymeleaf");
        model.addAttribute("name","香慧");
        return "index3";
    }
    @RequestMapping("/index4")
    public String index4(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("menu","admin");
        model.addAttribute("manager","manager");
        return "index4";
    }


    @RequestMapping("/index5")
    public String index5(Model model){
        //定义日期
        Date date = new Date();
        model.addAttribute("date",date);
        //定义数字
        Double number = 1234.457;
        model.addAttribute("num",number);
        //定义大文本
        String str="Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n" ;
        model.addAttribute("str",str);
        return "index5";
    }
}
