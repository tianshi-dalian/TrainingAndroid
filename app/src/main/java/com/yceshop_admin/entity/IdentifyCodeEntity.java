package com.yceshop_admin.entity;

/**
 * 验证码的databean
 * IdentifyCodeEntity
 *
 * @author gehang
 * @time 2018/5/28/028
 */
public class IdentifyCodeEntity {

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    /**
     * 验证码
     */

    private String codeName;
}
