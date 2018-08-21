package com.rd.zhongqipiaoetong.network.entity;

/**
 * Author: TinhoXu
 * E-mail: xth@erongdu.com
 * Date: 2016/4/5 15:23
 * <p/>
 * Description: 网络返回消息，最外层解析实体
 */
public class HttpResult {
    /**
     * 错误码
     */
    private int    resCode;
    private String res_code;
    /**
     * 错误信息
     */
    private String resMsg;
    private String res_msg;
    /**
     * 消息响应的主体
     */
    private Object resData;
    private Object res_data;
    /**
     * 这个json,自己做解析处理
     */
    private String body;

    public HttpResult() {
    }

    public int getResCode() {
        return resCode;
    }

    public void setResCode(int resCode) {
        this.resCode = resCode;
    }

    public String getResMsg() {
        return resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

    public Object getResData() {
        return resData;
    }

    public void setResData(Object resData) {
        this.resData = resData;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getRes_code() {
        if(res_code == null){
            res_code = "-1";
        }
        return res_code;
    }

    public void setRes_code(String res_code) {
        this.res_code = res_code;
    }

    public String getRes_msg() {
        return res_msg;
    }

    public void setRes_msg(String res_msg) {
        this.res_msg = res_msg;
    }

    public Object getRes_data() {
        return res_data;
    }

    public void setRes_data(Object res_data) {
        this.res_data = res_data;
    }

    @Override
    public String toString() {
        return "code:" + getResCode() + "resData" + getResData() + "resMsg" + getResMsg();
    }
}