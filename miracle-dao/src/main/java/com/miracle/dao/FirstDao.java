package com.miracle.dao;

import lombok.Data;

import java.util.Date;

/**
 * @author Miracle Xu
 * @Description:
 * @create: 2018/7/23 18:55
 * @Copyright: 2018 www.lvmama.com All rights reserved.
 **/

@Data
public class FirstDao {

    private int id;
    private Date createTime;
    private Date updateTime;
    private String key;
    private String value;
    private int valid;

}
