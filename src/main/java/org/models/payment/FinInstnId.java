package org.models.payment;


import jakarta.xml.bind.annotation.XmlElement;

public class FinInstnId {

    private String bicfi;

    public String getBicfi() {
        return bicfi;
    }

    @XmlElement(name= "BICFI")
    public void setBicfi(String bicfi) {
        this.bicfi = bicfi;
    }
}
