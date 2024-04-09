package org.models.payment;


import jakarta.xml.bind.annotation.XmlElement;

import java.util.List;

public class FIToFICstmrCdtTrf {

    private GrpHdr grpHdr;

   private List<CdtTrfTxInf> CdtTrfTxInfs;

    @XmlElement(name = "GrpHdr")
    public GrpHdr getGrpHdr() {
        return grpHdr;
    }

    public void setGrpHdr(GrpHdr grpHdr) {
        this.grpHdr = grpHdr;
    }

    @XmlElement(name = "CdtTrfTxInf")
    public List<CdtTrfTxInf> getCdtTrfTxInfs() {
        return CdtTrfTxInfs;
    }

    public void setCdtTrfTxInfs(List<CdtTrfTxInf> cdtTrfTxInfs) {
        CdtTrfTxInfs = cdtTrfTxInfs;
    }
}
