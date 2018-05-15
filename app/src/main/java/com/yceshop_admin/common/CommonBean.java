package com.yceshop_admin.common;

/**
 * 公共Bean
 * CommonBean
 *
 * @author tianshi
 * @time 2018/5/15
 */

public class CommonBean {
    /**
     * 状态（成功：1000，系统异常：0，失败：其余都是失败）
     */
    private int code;
    /**
     * 返回消息
     */
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
