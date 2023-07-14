package com.studentmanagement.studentmanagement.repository;

import com.studentmanagement.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
