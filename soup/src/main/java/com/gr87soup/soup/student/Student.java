package com.gr87soup.soup.student;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="student",namespace = "http://bykowski.pl/soup-example",propOrder = {
        "id",
        "name",
        "surname"
})
public class Student {

    protected Long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String surname;

    public long getId(){
        return id;
    }
    public void setId (long value) {
        this.id = value;
    }
    public String getName (){
        return name;
    }
    public  void  setName (String value){
        this.name = value;
    }
    public String getSurname (){
        return surname;
    }
    public  void  setSurname (String value){
        this.surname = value;
    }
}
