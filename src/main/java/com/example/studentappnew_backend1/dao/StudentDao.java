package com.example.studentappnew_backend1.dao;

import com.example.studentappnew_backend1.model.Students;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Students, Integer> {


}
