package com.gr87soup.soup.student;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="",propOrder = {
        "student"
})
@XmlRootElement(name = "getResponse",namespace = "http://gr87soup.com/soup-example")
public class GetResponse {
    @XmlElement (required = true)
    protected Student student;

    public Student getStudent(){
        return student;
    }
    public void setStudent (Student  value){
        this.student= value;
    }
}
