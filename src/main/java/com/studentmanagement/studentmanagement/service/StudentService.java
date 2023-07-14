package com.studentmanagement.studentmanagement.service;

import com.studentmanagement.studentmanagement.entity.Student;

import java.util.List;

public interface StudentService {
  List<Student> getAllStudent();

  void saveStudent(Student fullstudent);

  Student getStudentbyId(Long id);
  void saveUpdatedStudent(Student updatedStudent);

  void deleteStudentById(long l);
}
