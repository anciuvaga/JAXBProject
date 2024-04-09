package org.models.payment;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Document")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Document {

    private FileAppHdr fileAppHdr;

    private AppHdr appHdr;

    private CreditTransfer creditTransfer;

    public FileAppHdr getFileAppHdr() {
        return fileAppHdr;
    }

    @XmlElement(name = "FileAppHdr")
    public void setFileAppHdr(FileAppHdr fileAppHdr) {
        this.fileAppHdr = fileAppHdr;
    }

    public AppHdr getAppHdr() {
        return appHdr;
    }

    @XmlElement(name = "AppHdr")
    public void setAppHdr(AppHdr appHdr) {
        this.appHdr = appHdr;
    }

    public CreditTransfer getCreditTransfer() {
        return creditTransfer;
    }

    @XmlElement(name = "CreditTransfer")
    public void setCreditTransfer(CreditTransfer creditTransfer) {
        this.creditTransfer = creditTransfer;
    }
}
