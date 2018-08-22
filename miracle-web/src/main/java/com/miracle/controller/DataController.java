package com.miracle.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Miracle Xu
 * @Description:
 * @create: 2018/8/22 16:02
 * @Copyright: 2018 www.lvmama.com All rights reserved.
 **/
@RestController
public class DataController {
    private static final Logger logger = LogManager.getLogger(DataController.class);

    @RequestMapping("/test")
    public Map test(){
        logger.info("请求url：/test");
        String result = "result-success";
        Map resultMap = new HashMap(16);
        resultMap.put("result",result);
        logger.info("返回数据："+resultMap);
        return resultMap;
    }
}
