package org.models.payment;


import jakarta.xml.bind.annotation.XmlElement;

public class SttlmInf {

    private String sttlmMtd;

    private ClrSys clrSys;


    @XmlElement(name = "SttlmMtd")
    public String getSttlmMtd() {
        return sttlmMtd;
    }


    public void setSttlmMtd(String sttlmMtd) {
        this.sttlmMtd = sttlmMtd;
    }

    @XmlElement(name = "ClrSys")
    public ClrSys getClrSys() {
        return clrSys;
    }

    public void setClrSys(ClrSys clrSys) {
        this.clrSys = clrSys;
    }
}
