package org.models.payment;


import jakarta.xml.bind.annotation.XmlElement;

public class GrpHdr {

    private String msgId;

    private String creDtTm;

    private String nbOfTxs;

    private TtlIntrBkSttlmAmt ttlIntrBkSttlmAmt;

    private String intrBkSttlmDt;

    private SttlmInf sttlmInf;

    @XmlElement(name = "MsgId")
    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    @XmlElement(name = "CreDtTm")
    public String getCreDtTm() {
        return creDtTm;
    }

    public void setCreDtTm(String creDtTm) {
        this.creDtTm = creDtTm;
    }

    public String getNbOfTxs() {
        return nbOfTxs;
    }

    @XmlElement(name = "NbOfTxs")
    public void setNbOfTxs(String nbOfTxs) {
        this.nbOfTxs = nbOfTxs;
    }

    @XmlElement(name = "TtlIntrBkSttlmAmt")
    public TtlIntrBkSttlmAmt getTtlIntrBkSttlmAmt() {
        return ttlIntrBkSttlmAmt;
    }

    public void setTtlIntrBkSttlmAmt(TtlIntrBkSttlmAmt ttlIntrBkSttlmAmt) {
        this.ttlIntrBkSttlmAmt = ttlIntrBkSttlmAmt;
    }

    public String getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    @XmlElement(name = "IntrBkSttlmDt")
    public void setIntrBkSttlmDt(String intrBkSttlmDt) {
        this.intrBkSttlmDt = intrBkSttlmDt;
    }

    public SttlmInf getSttlmInf() {
        return sttlmInf;
    }

    @XmlElement(name = "SttlmInf")
    public void setSttlmInf(SttlmInf sttlmInf) {
        this.sttlmInf = sttlmInf;
    }
}
