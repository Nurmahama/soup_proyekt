package com.gr87soup.soup.student;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="",propOrder = {
        "id"
})
@XmlRootElement(name = "getStudent",namespace = "http://gr87soup.com/soup-example")

public class GetStudent {
    protected  Long  id;
    public Long getId() {
        return id;
    }
    public void setId(Long value) {
        this.id=value;
    }
}
