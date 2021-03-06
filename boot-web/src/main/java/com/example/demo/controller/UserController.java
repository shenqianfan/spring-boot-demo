package com.example.demo.controller;

import com.boot.manager.UserManager;
import com.yiyi.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>文件名称：com.example.demo.controller</p>;
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
@RestController
public class UserController {

    @Autowired
    private UserManager userManager;

    @RequestMapping("/helloworld")
    String helloWorld(){
        UserInfo userInfo = userManager.getUserInfoById(1L);
        return userInfo.getUserId();
    }
}
