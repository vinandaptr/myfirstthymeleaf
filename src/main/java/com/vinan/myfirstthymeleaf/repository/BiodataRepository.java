package com.vinan.myfirstthymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinan.myfirstthymeleaf.model.entity.Biodata;

@Repository
public interface BiodataRepository extends JpaRepository<Biodata, Integer>{

}
