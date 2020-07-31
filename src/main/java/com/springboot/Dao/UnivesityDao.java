package com.springboot.Dao;

import com.springboot.Entity.University;
import org.springframework.data.repository.CrudRepository;

public interface UnivesityDao extends CrudRepository<University, Integer> {
    @Override
    <S extends University> S save(S s);
}
