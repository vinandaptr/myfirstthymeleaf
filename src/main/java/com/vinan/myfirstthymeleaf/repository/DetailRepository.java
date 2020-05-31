package com.vinan.myfirstthymeleaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinan.myfirstthymeleaf.model.entity.DetailBiodata;

public interface DetailRepository extends JpaRepository<DetailBiodata, Integer>{
	
	List<DetailBiodata>
    findAllByGolonganDarah(String golonganDarah);

}
