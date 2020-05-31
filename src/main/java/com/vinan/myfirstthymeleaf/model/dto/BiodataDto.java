package com.vinan.myfirstthymeleaf.model.dto;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter @Setter
public class BiodataDto {
    private Integer id;
    private String fullName;
	private String email;
	private String phone;
	private String address;
	private Date birthday;
	private String idCard;
	private String univ;
	private String major;
	private String gpa;
	private String cover;
	private String hobby;
	private String gender;
	private String religion;
	
    private String tempatLahir;
    private String golonganDarah;
    
}
