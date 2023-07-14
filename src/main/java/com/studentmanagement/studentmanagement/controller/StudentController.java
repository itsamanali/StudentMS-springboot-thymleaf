package com.studentmanagement.studentmanagement.controller;

import com.studentmanagement.studentmanagement.entity.Student;
import com.studentmanagement.studentmanagement.service.Impl.StudentServiceImpl;
import com.studentmanagement.studentmanagement.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
private StudentService studentService;

    public  StudentController (StudentService studentService) {
        super();
        this.studentService =studentService;
    }
    @GetMapping("/students")
    public String studentList(Model model){
        model.addAttribute("students" , studentService.getAllStudent());
        return "students";
    }
    @GetMapping("/student/new")
    public String addStudentForm(Model model){
        Student blankstudent = new Student();
        model.addAttribute("newStudent",blankstudent);

        return "studentForm";
    }
    @PostMapping("/addStudent")
    public String saveStudent(@ModelAttribute("newStudent") Student fullstudent){
        studentService.saveStudent(fullstudent);
        return "redirect:/students";
    }
    @GetMapping("/student/edit/{id}")
    public String updateStudent(@PathVariable String id, Model model){
      Student studentTobUpdate =  studentService.getStudentbyId(Long.parseLong(id));
      model.addAttribute("student",studentTobUpdate);
      return "studentEditForm";
    }
    @PostMapping("/saveEditedStudent/{id}")
    public String saveUpdatedStudent(@PathVariable Long id,@ModelAttribute("student") Student updatedStudent,Model model){
        Student existingStudent = studentService.getStudentbyId(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(updatedStudent.getFirstName());
        existingStudent.setLastName(updatedStudent.getLastName());
        existingStudent.setEmail(updatedStudent.getEmail());

        studentService.saveUpdatedStudent(existingStudent);
        return "redirect:/students";
    }
    @GetMapping("/student/delete/{id}")
    public String deleteStudent(@PathVariable String id,Model model){
        studentService.deleteStudentById(Long.parseLong(id));
        return "redirect:/students";
    }
}
