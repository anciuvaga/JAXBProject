package org.models.payment;


import jakarta.xml.bind.annotation.XmlElement;

public class ClrSys {

    private String cd;

    @XmlElement(name = "Cd")
    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }
}
