package com.studentmanagement.studentmanagement.service.Impl;

import com.studentmanagement.studentmanagement.entity.Student;
import com.studentmanagement.studentmanagement.repository.StudentRepo;
import com.studentmanagement.studentmanagement.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepo studentRepo;
    public StudentServiceImpl(StudentRepo studentRepo){
        super();
        this.studentRepo = studentRepo;
    }
    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public void saveStudent(Student fullstudent) {
        studentRepo.save(fullstudent);
    }

    @Override
    public Student getStudentbyId(Long id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public void saveUpdatedStudent(Student updatedStudent) {
        studentRepo.save(updatedStudent);
    }

    @Override
    public void deleteStudentById(long l) {
        studentRepo.deleteById(l);
    }

}
