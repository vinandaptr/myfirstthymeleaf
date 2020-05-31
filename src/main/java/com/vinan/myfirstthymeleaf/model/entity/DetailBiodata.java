package com.vinan.myfirstthymeleaf.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = DetailBiodata.TABLENAME)
public class DetailBiodata {
    public static final String TABLENAME = "t_detail";

    @Id
    @GeneratedValue
   
    private Integer id;

    private String tempatLahir;

    private String golonganDarah;


}

