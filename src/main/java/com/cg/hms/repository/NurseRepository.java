package com.cg.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hms.Entity.Nurse;

@Repository
public interface NurseRepository extends JpaRepository<Nurse, Integer>{

}