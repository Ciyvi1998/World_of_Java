package com.springboot.Controller;

import com.springboot.Entity.Student;
import com.springboot.Entity.University;
import com.springboot.Service.StudentService;
import com.springboot.Service.UniveristyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.model.IModel;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private UniveristyService univeristyService;

    @RequestMapping( method = RequestMethod.GET)
     public String  findAll(Model model){

        model.addAttribute("students", studentService.findAll());

        return "students";
    }

//    @RequestMapping(value = "/add" , method = RequestMethod.POST)
//    public String  saveStudent(@ModelAttribute("student") Student student,
//                               Model model) {
//        model.addAttribute("student", student);
//        studentService.saveStudent(student);
//        return "registerStudent";
//    }

    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public String  saveStudent(@RequestParam(value = "firstName", required = false) String firstName,
                               @RequestParam(value = "surName", required = false) String surName,
                               @RequestParam(value = "universityId", required = false) Integer universityId,
                               Model model) {
        Student student = new Student();
        //Student student1 = new Student(99,"kale","kalevichi", univeristyService.findById(universityId));

        model.addAttribute("firstName", firstName);
        model.addAttribute("surName", surName);
        model.addAttribute("universityId", universityId);

        student.setName(firstName);
        student.setSurname(surName);
     //   student.setUniversity();
        studentService.saveStudent(student);
        return "registerStudent";
    }

    @GetMapping("/api")
    public Optional<Student> findById(@RequestParam(value = "student_id", required = true)Integer id){
        return studentService.findById(id);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteById(@RequestParam(value = "id", required = false) Integer id,
                             Model model){
        model.addAttribute("id", id);
        studentService.deleteById(id);
        return "redirect:/students";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateById(@PathVariable("id") @RequestBody Integer id) {
        studentService.updateById(id);
    }

}
