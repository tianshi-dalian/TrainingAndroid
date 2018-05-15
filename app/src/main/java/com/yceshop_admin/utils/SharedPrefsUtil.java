package com.yceshop_admin.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 * Created by Administrator on 2017-04-07.
 */

public class SharedPrefsUtil {
    /**
     * SharedPrefs文件名(保存正常数据)
     */
    private static final String constant01 = "yingcheng";

    /**
     * 历史记录数组名
     */
    private static final String constant02 = "history";
    /**
     * SharedPrefs文件名(保存历史记录)
     */
    private static final String constant03 = "yingcheng1";





    /**
     * 向SharedPreferences中写入int类型数据
     *
     * @param context 上下文环境
     * @param key     键
     * @param value   值
     */
    public static void putValue(Context context, String key,
                                int value) {
        Editor sp = getEditor(context, constant01);
        sp.putInt(key, value);
        sp.commit();
    }

    /**
     * 向SharedPreferences中写入boolean类型的数据
     *
     * @param context 上下文环境
     * @param key     键
     * @param value   值
     */
    public static void putValue(Context context, String key,
                                boolean value) {
        Editor sp = getEditor(context, constant01);
        sp.putBoolean(key, value);
        sp.commit();
    }

    /**
     * 向SharedPreferences中写入String类型的数据
     *
     * @param context 上下文环境
     * @param key     键
     * @param value   值
     */
    public static void putValue(Context context, String key, String value) {
        Editor sp = getEditor(context, constant01);
        sp.putString(key, value);
        sp.commit();
    }

    /**
     * 向SharedPreferences中写入float类型的数据
     *
     * @param context 上下文环境
     * @param key     键
     * @param value   值
     */
    public static void putValue(Context context, String key, float value) {
        Editor sp = getEditor(context, constant01);
        sp.putFloat(key, value);
        sp.commit();
    }

    /**
     * 向SharedPreferences中写入long类型的数据
     *
     * @param context 上下文环境
     * @param key     键
     * @param value   值
     */
    public static void putValue(Context context, String key, long value) {
        Editor sp = getEditor(context, constant01);
        sp.putLong(key, value);
        sp.commit();
    }

    /**
     * 从SharedPreferences中读取int类型的数据
     *
     * @param context  上下文环境
     * @param key      键
     * @param defValue 如果读取不成功则使用默认值
     * @return 返回读取的值
     */
    public static int getValue(Context context, String key, int defValue) {
        SharedPreferences sp = getSharedPreferences(context, constant01);
        int value = sp.getInt(key, defValue);
        return value;
    }

    /**
     * 从SharedPreferences中读取boolean类型的数据
     *
     * @param context  上下文环境
     * @param key      键
     * @param defValue 如果读取不成功则使用默认值
     * @return 返回读取的值
     */
    public static boolean getValue(Context context, String key,
                                   boolean defValue) {
        SharedPreferences sp = getSharedPreferences(context, constant01);
        boolean value = sp.getBoolean(key, defValue);
        return value;
    }

    /**
     * 从SharedPreferences中读取String类型的数据
     *
     * @param context  上下文环境
     * @param key      键
     * @param defValue 如果读取不成功则使用默认值
     * @return 返回读取的值
     */
    public static String getValue(Context context, String key,
                                  String defValue) {
        SharedPreferences sp = getSharedPreferences(context, constant01);
        String value = sp.getString(key, defValue);
        return value;
    }

    /**
     * 从SharedPreferences中读取float类型的数据
     *
     * @param context  上下文环境
     * @param key      键
     * @param defValue 如果读取不成功则使用默认值
     * @return 返回读取的值
     */
    public static float getValue(Context context, String key,
                                 float defValue) {
        SharedPreferences sp = getSharedPreferences(context, constant01);
        float value = sp.getFloat(key, defValue);
        return value;
    }

    /**
     * 从SharedPreferences中读取long类型的数据
     *
     * @param context  上下文环境
     * @param key      键
     * @param defValue 如果读取不成功则使用默认值
     * @return 返回读取的值
     */
    public static long getValue(Context context, String key,
                                long defValue) {
        SharedPreferences sp = getSharedPreferences(context, constant01);
        long value = sp.getLong(key, defValue);
        return value;
    }

    //获取Editor实例
    private static Editor getEditor(Context context, String name) {
        return getSharedPreferences(context, name).edit();
    }

    //获取SharedPreferences实例
    private static SharedPreferences getSharedPreferences(Context context, String name) {
        return context.getSharedPreferences(name, Context.MODE_PRIVATE);
    }
}

