package com.gr87soup.soup.student;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class StudentEndpoint {

    private StudentServis studentServis;

    public StudentEndpoint(StudentServis studentServis) {
        this.studentServis = studentServis;
    }
    @PayloadRoot(namespace = "http://gr87soup.com/soup-example",localPart = "getStudent")
    @ResponsePayload
    public GetResponse getStudentById(@RequestPayload GetStudent getStudent) {
        Student studentById = studentServis.getStudentsById(getStudent.getId());;
        GetResponse getResponse = new GetResponse();
        getResponse.setStudent(studentById);
        return getResponse;

    }
}
