package org.models.payment;


import jakarta.xml.bind.annotation.XmlAttribute;

public class TtlIntrBkSttlmAmt {

    private String ccy;

    @XmlAttribute(name = "Ccy")
    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

}
