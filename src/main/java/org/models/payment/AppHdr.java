package org.models.payment;


import jakarta.xml.bind.annotation.XmlElement;

public class AppHdr {

    private FinInstnId finInstnId;

    private String bizMsgIdr;

    private String msgDefIdr;

    private String creDt;

    @XmlElement(name = "FinInstnId")
    public FinInstnId getFinInstnId() {
        return finInstnId;
    }

    public void setFinInstnId(FinInstnId finInstnId) {
        this.finInstnId = finInstnId;
    }

    @XmlElement(name = "BizMsgIdr")
    public String getBizMsgIdr() {
        return bizMsgIdr;
    }

    public void setBizMsgIdr(String bizMsgIdr) {
        this.bizMsgIdr = bizMsgIdr;
    }

    @XmlElement(name = "MsgDefIdr")
    public String getMsgDefIdr() {
        return msgDefIdr;
    }

    public void setMsgDefIdr(String msgDefIdr) {
        this.msgDefIdr = msgDefIdr;
    }

    @XmlElement(name = "CreDt")
    public String getCreDt() {
        return creDt;
    }
    public void setCreDt(String creDt) {
        this.creDt = creDt;
    }
}
