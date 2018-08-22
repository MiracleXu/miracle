package com.miracle.controller;

import com.miracle.interfaces.AssAz;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Miracle Xu
 * @Description: index Controller
 * @create: 2018/7/23 17:35
 * @Copyright: 2018 www.lvmama.com All rights reserved.
 **/

@Controller
public class IndexController {

    private static final Logger logger = LogManager.getLogger(IndexController.class);

    @Autowired
    AssAz assAz;

    @RequestMapping("/index")
    public String index(){
        logger.info("请求url：/index");
        String result = assAz.indexString();
        return "indexMain";
    }

    @RequestMapping("/")
    public String indexMain(){
        logger.info("请求url：/\"\"");
        String result = assAz.indexString();
        return "indexMain";
    }
}
