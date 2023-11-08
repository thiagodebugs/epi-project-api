package com.masterpi.domain.epi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpiRepository extends JpaRepository<Epi, Integer>{
	
}
