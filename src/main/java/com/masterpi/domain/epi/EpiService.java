package com.masterpi.domain.epi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EpiService {

	@Autowired
	EpiRepository epiRepository;
	
	public Epi save(Epi epi) {
		return epiRepository.save(epi);
	}
	
	public List<Epi> findAll() {
		return epiRepository.findAll();
	}
	
	public Epi findById(Integer id) {
		return epiRepository.findById(id).get();
	}
	
	public void deleteById(Integer id) {
		epiRepository.deleteById(id);
	}
	
}
