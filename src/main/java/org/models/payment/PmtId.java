package org.models.payment;

import jakarta.xml.bind.annotation.XmlElement;

public class PmtId {

    private String  instrId;

    private String endToEndId;

    private String txId;

    private String clrSysRef;

    @XmlElement(name = "InstrId")
    public String getInstrId() {
        return instrId;
    }

    public void setInstrId(String instrId) {
        this.instrId = instrId;
    }

    @XmlElement(name = "EndToEndId")
    public String getEndToEndId() {
        return endToEndId;
    }

    public void setEndToEndId(String endToEndId) {
        this.endToEndId = endToEndId;
    }

    @XmlElement(name = "TxId")
    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    @XmlElement(name = "ClrSysRef")
    public String getClrSysRef() {
        return clrSysRef;
    }

    public void setClrSysRef(String clrSysRef) {
        this.clrSysRef = clrSysRef;
    }
}
