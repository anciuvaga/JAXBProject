package org.models.payment;


import jakarta.xml.bind.annotation.XmlElement;

public class CreditTransfer {

    private FIToFICstmrCdtTrf fiToFICstmrCdtTrf;

    public FIToFICstmrCdtTrf getFiToFICstmrCdtTrf() {
        return fiToFICstmrCdtTrf;
    }

    @XmlElement(name = "FIToFICstmrCdtTrf")
    public void setFiToFICstmrCdtTrf(FIToFICstmrCdtTrf fiToFICstmrCdtTrf) {
        this.fiToFICstmrCdtTrf = fiToFICstmrCdtTrf;
    }

}
