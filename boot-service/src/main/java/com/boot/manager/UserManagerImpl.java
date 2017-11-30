package com.boot.manager;

import com.boot.dao.UserMapper;
import com.boot.domain.UserDO;
import com.yiyi.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>文件名称：com.boot.manager</p>;
 * <p>文件描述：</p>;
 * <p>版权所有： 版权所有(C)2011-2099</p>;
 * <p>公   司： 口袋购物</p>;
 * <p>内容摘要： </p>;
 * <p>其他说明：</p>;
 * <p>完成日期：17/11/29</p>;
 *
 * @author shenxiaoqian@weidian.com
 * @version 1.0
 */
@Service("userManager")
public class UserManagerImpl implements UserManager {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfo getUserInfoById(Long userId) {

        UserInfo userInfo = new UserInfo();

        UserDO userDO = userMapper.getById(userId);

        userInfo.setUserId(userDO.getDescription());
        return userInfo;
    }
}
