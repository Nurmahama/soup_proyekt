package com.gr87soup.soup.student;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServis {

    private List <Student> students;

    public Student getStudentsById(Long id) {

        return  students
                .stream()
                .filter(student -> student.getId() == id)
                .findFirst().get();
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public  StudentServis () {
        students = new ArrayList<>();
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Maqa");
        student1.setSurname("Mammadov");
        Student student2 = new Student();
         student2.setId(2);
        student2.setName("Emil");
        student1.setSurname("Muradzade");
        students.add(student1);
        students.add(student2);
    }

}
