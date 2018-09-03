package com.miracle.mapper;

import com.miracle.dao.FirstDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Miracle Xu
 * @Description:
 * @create: 2018/8/22 17:39
 * @Copyright: 2018 www.lvmama.com All rights reserved.
 **/
@Repository
public interface DictMapper {
    List<FirstDao> queryList();
}
