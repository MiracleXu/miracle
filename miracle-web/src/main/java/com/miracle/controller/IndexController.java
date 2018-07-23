package com.miracle.controller;

import com.miracle.interfaces.AssAz;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    AssAz assAz;

    @RequestMapping("/index")
    public String index(){
        String result = assAz.indexString();
        return "Hello World!           "+result;
    }
}
