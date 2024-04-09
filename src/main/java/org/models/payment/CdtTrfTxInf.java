package org.models.payment;


import jakarta.xml.bind.annotation.XmlElement;

public class CdtTrfTxInf {

  private PmtId pmtId;


    public PmtId getPmtId() {
        return pmtId;
    }

    @XmlElement(name = "PmtId")
    public void setPmtId(PmtId pmtId) {
        this.pmtId = pmtId;
    }
}
