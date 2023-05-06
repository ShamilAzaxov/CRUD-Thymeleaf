package com.mastercode.service;

import com.mastercode.entity.Student;
import com.mastercode.repository.StudentRepository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
