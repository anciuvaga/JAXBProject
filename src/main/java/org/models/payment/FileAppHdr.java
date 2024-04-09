package org.models.payment;


import jakarta.xml.bind.annotation.XmlElement;

public class FileAppHdr {

    private String nbOfBtchs;

    private String sttlmCycl;
    @XmlElement(name = "NbOfBtchs")
    public String getNbOfBtchs() {
        return nbOfBtchs;
    }

    public void setNbOfBtchs(String nbOfBtchs) {
        this.nbOfBtchs = nbOfBtchs;
    }

    @XmlElement(name = "SttlmCycl")
    public String getSttlmCycl() {
        return sttlmCycl;
    }

    public void setSttlmCycl(String sttlmCycl) {
        this.sttlmCycl = sttlmCycl;
    }
}
