package com.springboot.Dao;

import com.springboot.Entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentDao extends CrudRepository<Student, Integer> {
    @Override
    <S extends Student> S save(S s);

    @Override
    void deleteById(Integer integer);

    @Override
    Iterable<Student> findAll();

    @Override
    Optional<Student> findById(Integer integer);


}
