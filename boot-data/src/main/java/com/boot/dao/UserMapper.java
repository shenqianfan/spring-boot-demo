package com.boot.dao;

import com.boot.domain.UserDO;

/**
 * <p>文件名称：com.boot.dao</p>;
 * <p>文件描述：</p>;
 * <p>版权所有： 版权所有(C)2011-2099</p>;
 * <p>公   司： 口袋购物</p>;
 * <p>内容摘要： </p>;
 * <p>其他说明：</p>;
 * <p>完成日期：17/11/30</p>;
 *
 * @author shenxiaoqian@weidian.com
 * @version 1.0
 */
public interface UserMapper {

    UserDO getById(Long id);
}
