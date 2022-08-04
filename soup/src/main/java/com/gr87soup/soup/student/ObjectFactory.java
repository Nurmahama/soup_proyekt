package com.gr87soup.soup.student;

import javax.xml.bind.annotation.XmlRegistry;
@XmlRegistry
public class ObjectFactory {


        public ObjectFactory() {

        }

        public GetResponse createGetResponse() {
            return new GetResponse();
        }
        public  Student createStudent (){
            return  new Student();
        }
        public GetStudent createGetStuident () {
            return new GetStudent();
        }

    }

