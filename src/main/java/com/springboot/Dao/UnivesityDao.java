package com.springboot.Dao;

import com.springboot.Entity.University;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnivesityDao extends CrudRepository<University, Integer> {
    @Override
    <S extends University> S save(S s);

    @Override
    Optional<University> findById(Integer integer);

}
