/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean.notis1;

/**
 *
 * @author trainee4
 */
public class Data {

    private String msgId;
    private String dataFormat;
    private CSV tradesInquiry;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getDataFormat() {
        return dataFormat;
    }

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    public CSV getTradesInquiry() {
        return tradesInquiry;
    }

    public void setTradesInquiry(CSV tradesInquiry) {
        this.tradesInquiry = tradesInquiry;
    }

}
