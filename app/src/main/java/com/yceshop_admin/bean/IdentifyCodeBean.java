package com.yceshop_admin.bean;

import com.yceshop_admin.common.CommonBean;
import com.yceshop_admin.entity.IdentifyCodeEntity;


/**
 * 验证码的bean
 * IdentifyCodeBean
 *
 * @author gehang
 * @time 2018/5/28/028
 */
public class IdentifyCodeBean extends CommonBean {
    /**
     * 用户名*/
    private String userName;
    /**
     * 后台返回结果
     */
    private IdentifyCodeEntity data;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public IdentifyCodeEntity getData() {
        return data;
    }

    public void setData(IdentifyCodeEntity data) {
        this.data = data;
    }
}
