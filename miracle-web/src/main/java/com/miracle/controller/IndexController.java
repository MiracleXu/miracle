package com.miracle.controller;

import com.miracle.interfaces.AssAz;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        String result = assAz.indexString();
        logger.info("ces");
        return "indexMain";
    }

    @RequestMapping("/")
    public String indexMain(){
        String result = assAz.indexString();

        logger.info("ces");
        return "indexMain";
    }
}
