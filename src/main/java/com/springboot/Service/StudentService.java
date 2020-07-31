package com.springboot.Service;

import com.springboot.Dao.StudentDao;
import com.springboot.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public void saveStudent(Student student) {
        studentDao.save(student);
    }

    public void deleteById(Integer id){
        studentDao.deleteById(id);
    }

    public Iterable<Student> findAll(){
        return studentDao.findAll();
    }

   // @Qualifier("data")
    public void updateById(Integer id){
        Student student1 = studentDao.findById(id).get();
        student1.setName("niko 22");
        studentDao.save(student1);

    }

    public Optional<Student> findById(Integer id){
        return studentDao.findById(id);
    }

}
