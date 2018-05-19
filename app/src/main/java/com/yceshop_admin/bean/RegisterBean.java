package com.yceshop_admin.bean;

import com.yceshop_admin.common.CommonBean;
import com.yceshop_admin.entity.RegisterEntity;

/**
 * 注册的javabean
 * RegisterBean
 *
 * @author gehang
 * @time 2018/5/18/018
 */
public class RegisterBean extends CommonBean {
    /**
     * 用户名
     */
    private String userName;

    /**
     *验证码
     *
     */
    private  String codeName;

    /**
     *
     *用户密码
     */
    private String userPass;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }


    private RegisterEntity  data;

    public RegisterEntity getData() {
        return data;
    }

    public void setData(RegisterEntity data) {
        this.data = data;
    }
}
