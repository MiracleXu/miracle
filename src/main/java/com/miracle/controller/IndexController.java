package com.miracle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Miracle Xu
 * @Description: index Controller
 * @create: 2018/7/23 17:35
 * @Copyright: 2018 www.lvmama.com All rights reserved.
 **/

@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "Hello World!";
    }
}
