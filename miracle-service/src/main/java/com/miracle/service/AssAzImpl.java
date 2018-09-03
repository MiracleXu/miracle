package com.miracle.service;

import com.miracle.interfaces.AssAz;
import org.springframework.stereotype.Service;

/**
 * @author Miracle Xu
 * @Description:
 * @create: 2018/8/22 18:01
 * @Copyright: 2018 www.lvmama.com All rights reserved.
 **/
@Service
public class AssAzImpl implements AssAz {
    @Override
    public String indexString() {
        return "AssAz Success";
    }
}
