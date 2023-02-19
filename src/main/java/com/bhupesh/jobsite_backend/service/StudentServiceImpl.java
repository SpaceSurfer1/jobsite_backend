package com.bhupesh.jobsite_backend.service;

import com.bhupesh.jobsite_backend.model.Student;
import com.bhupesh.jobsite_backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
