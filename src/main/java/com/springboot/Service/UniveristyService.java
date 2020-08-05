package com.springboot.Service;

import com.springboot.Dao.UnivesityDao;
import com.springboot.Entity.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UniveristyService {

    @Autowired
    UnivesityDao univesityDao;

    public void save(University university) {
        univesityDao.save(university);
    }

    public Optional<University> findById(Integer id){
        return univesityDao.findById(id);
    }


}
