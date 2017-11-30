package com.yiyi.domain;

import java.io.Serializable;

/**
 * <p>文件名称：com.yiyi.domain</p>;
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
public class UserInfo implements Serializable{

    private static final long serialVersionUID = 2689004451910902716L;

    /**
     * 用户id
     */
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
