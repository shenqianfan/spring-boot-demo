package com.boot.domain;

import java.io.Serializable;

/**
 * <p>文件名称：com.boot.domain</p>;
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
public class UserDO {

    private Long id;

    private String name;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
