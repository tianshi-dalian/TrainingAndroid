package com.yceshop_admin.bean;

import com.yceshop_admin.common.CommonBean;
import com.yceshop_admin.entity.LoginEntity;

/**
 * 登录bean
 * LoginBean
 *
 * @author gehang
 * @time 2018/5/18/018
 */

public class LoginBean extends CommonBean {
    /**
     * 手机号
     */
    private String userName;
    /**
     * 用户密码
     */
    private String userPass;
    /**
     * 身份区分（m：会员，d：经销商）
     */
    private String userType = "d";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public LoginEntity getData() {
        return data;
    }

    public void setData(LoginEntity data) {
        this.data = data;
    }

    /**
     * 后台返回结果
     */
    private LoginEntity data;


}
