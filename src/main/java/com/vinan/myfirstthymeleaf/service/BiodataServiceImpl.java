package com.vinan.myfirstthymeleaf.service;

import com.vinan.myfirstthymeleaf.model.entity.Biodata;
import com.vinan.myfirstthymeleaf.repository.BiodataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class BiodataServiceImpl implements BiodataService {
	    @Autowired
	    private BiodataRepository biodataRepository;

	    @Override
	    public Biodata latTransactional() {
	        Biodata biodata = biodataRepository.findById(6).get();
	        biodata.setFullName("perubahan 1");
	        biodataRepository.save(biodata);

	        Integer.parseInt("errorword");

	        biodata.setFullName("perubahan 2");

	        biodataRepository.save(biodata);

	        return biodata;
	    }
	}
