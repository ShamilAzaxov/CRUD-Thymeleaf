package com.mastercode;

import com.mastercode.controller.StudentController;
import com.mastercode.entity.Student;
import com.mastercode.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository repo;

    @Override
    public void run(String... args) throws Exception {

        Student s1 = new Student("Shamil", "Azaxov", "shamil@gmail.com");
        Student s2 = new Student("Zamir", "Azaxov", "zamir@gmail.com");
        Student s3 = new Student("Kamil", "Azaxov", "kamil@gmail.com");
        repo.save(s1);
        repo.save(s2);
        repo.save(s3);

    }
}
