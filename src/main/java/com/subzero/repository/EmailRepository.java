package com.subzero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.subzero.domian.entity.Email;

@Repository
public interface EmailRepository extends CrudRepository<Email, Long> {

	@Query("SELECT e FROM Email e WHERE e.user.id = ?1")
	public List<Email> getEmailsByUser(Long id);
	


	
}
