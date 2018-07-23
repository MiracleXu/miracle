package com.miracle.service;

import com.miracle.interfaces.AssAz;
import org.springframework.stereotype.Service;

/**
 * @author Miracle Xu
 * @Description:
 * @create: 2018/7/23 18:55
 * @Copyright: 2018 www.lvmama.com All rights reserved.
 **/

@Service
public class AssAzImpl implements AssAz {

    @Override
    public String indexString() {
        return "AssaZ";
    }
}
