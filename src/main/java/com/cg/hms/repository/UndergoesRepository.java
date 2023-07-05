package com.cg.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hms.Entity.Undergoes;
import com.cg.hms.Entity.UndergoesId;

@Repository
public interface UndergoesRepository extends JpaRepository<Undergoes,UndergoesId>{

}
