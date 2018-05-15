package com.yceshop_admin.bean;

import com.yceshop_admin.common.CommonBean;
import com.yceshop_admin.entity.LoginEntity;

/**
 * Created by Administrator on 2018/5/10.
 */

public class LoginBean extends CommonBean {
    /**
     * 手机号
     */
    private String ucode;
    /**
     * 用户密码
     */
    private String userPw;
    /**
     * 身份区分（m：会员，d：经销商）
     */
    private String userType = "d";
    /**
     * 后台返回结果
     */
    private LoginEntity data;

    public String getUcode() {
        return ucode;
    }

    public void setUcode(String ucode) {
        this.ucode = ucode;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
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
}
