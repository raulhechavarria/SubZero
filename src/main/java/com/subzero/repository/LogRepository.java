package com.subzero.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.subzero.domian.entity.Log;
import com.subzero.domian.entity.User;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {

}
